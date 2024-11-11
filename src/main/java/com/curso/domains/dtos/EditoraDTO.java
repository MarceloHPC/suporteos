package com.curso.domains.dtos;



import com.curso.domains.Editora;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EditoraDTO {

    private int id;

    @NotNull(message = "O campo razão social não pode ser nulo")
    @NotBlank(message = "O campo razão social não pode estar vazio")
    private String razaoSocial;

    @NotNull(message = "O campo CNPJ não pode ser nulo")
    @NotBlank(message = "O campo CNPJ não pode estar vazio")
    private String cnpj;

    public EditoraDTO() {}

    public EditoraDTO(Editora editora) {
        this.id = editora.getIdEditora();
        this.razaoSocial = editora.getRazaoSocial();
        this.cnpj = editora.getCnpj();
    }

    public int getId() {
        return id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
}