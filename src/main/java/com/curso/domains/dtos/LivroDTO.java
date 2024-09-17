package com.curso.domains.dtos;


import com.curso.enums.Conservacao;
import com.curso.domains.Livro;
import jakarta.validation.constraints.NotBlank;
import com.curso.enums.Status;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LivroDTO {

    private long id;

    @NotNull(message = "O campo título não pode ser nulo")
    @NotBlank(message = "O campo título não pode estar vazio")
    private String titulo;

    @NotNull(message = "O campo ISBN não pode ser nulo")
    @NotBlank(message = "O campo ISBN não pode estar vazio")
    private String isbn;

    @Min(value = 1, message = "O número de páginas deve ser maior que 0")
    private int numeroPaginas;

    @NotNull(message = "O campo status não pode ser nulo")
    private Status status;


    @NotNull(message = "O campo valor não pode ser nulo")
    private BigDecimal valorCompra;


    @NotNull(message = "O campo data não pode ser nulo")
    private LocalDate dataCompra;

    @NotNull(message = "O campo conservação não pode ser nulo")
    private Conservacao conservacao;


    public LivroDTO() {
    }

    public LivroDTO(Livro livro) {
        this.id = livro.getIdLivro();
        this.titulo = livro.getTitulo();
        this.isbn = livro.getIsbn();
        this.numeroPaginas = livro.getNumeroPaginas();
        this.status = livro.getStatus();
        this.valorCompra = livro.getValorCompra();
        this.dataCompra = livro.getDataCompra();
        this.conservacao = livro.getConservacao();
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public Status getStatus() {
        return status;
    }
    public BigDecimal getValorCompra() {
        return valorCompra;
    }
     public LocalDate getDataCompra() {
        return dataCompra;
     }
    public Conservacao getConservacao() {
        return conservacao;
    }



}