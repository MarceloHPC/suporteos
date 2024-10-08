package com.curso.domains;



import jakarta.persistence.*;


@Entity
@Table(name = "autor")
public class Autor {

    // Construtor padrão necessário para JPA
    public Autor() {}

    // Construtor com parâmetros
    public Autor(String nome, String documentoPessoal) {
        this.nome = nome;
        this.documentoPessoal = documentoPessoal;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor") 
    private Integer idAutor;

    private String nome;

    private String documentoPessoal;

    // Getters e Setters
    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoPessoal() {
        return documentoPessoal;
    }

    public void setDocumentoPessoal(String documentoPessoal) {
        this.documentoPessoal = documentoPessoal;
    }
}
