package com.curso.domains;

import com.curso.enums.Conservacao;
import com.curso.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_livro")
    private Long idLivro;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="status")
    private Status status;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="conservacao")
    private Conservacao conservacao;

    @NotNull
    @NotBlank
    private String titulo;

    @NotNull
    @NotBlank
    private String isbn;

    @NotNull
    private Integer numeroPaginas;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_compra")
    private LocalDate dataCompra = LocalDate.now();

    @Column(name = "valor_compra") // Alterar o nome da coluna para evitar conflitos
    private BigDecimal valorCompra;

    @ManyToOne
    @JoinColumn(name = "Editora")
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "Autor")
    private Autor autor;

    // Construtor com parâmetros
    public Livro(String titulo, long idLivro, String isbn, Integer numeroPaginas, LocalDate dataCompra, BigDecimal valorCompra, Conservacao conservacao, Status status, Editora editora, Autor autor) {
        this.titulo = titulo;
        this.idLivro = idLivro;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.dataCompra = dataCompra != null ? dataCompra : LocalDate.now(); // Garante que, se não passado, pega o valor atual
        this.valorCompra = valorCompra;
        this.conservacao = conservacao;
        this.status = status;
        this.editora = editora;
        this.autor = autor;
    }

    // Construtor padrão
    public Livro() {
    }

    // Getters e Setters

    public long getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public Status getStatus() {
        return status;
    }

    public Conservacao getConservacao() {
        return conservacao;
    }

    // Override de equals e hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return idLivro.equals(livro.idLivro); // Comparação por valor de ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLivro);
    }
}
