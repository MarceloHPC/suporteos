package com.curso.domains;


import jakarta.persistence.*;

@Entity
@Table(name = "Editora")
public class Editora {

    public Editora() {
    }

    public Editora(String razaoSocial, String CNPJ) {
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_editora")
    private Integer idEditora;

    private String CNPJ;

    private String razaoSocial;

    // Getters e Setters
    public Integer getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(Integer idEditora) {
        this.idEditora = idEditora;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}