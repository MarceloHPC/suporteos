package com.curso.domains.dtos;



import com.curso.domains.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AutorDTO {

    private int id;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode estar vazio")
    private String nome;

    @NotNull(message = "O campo documento pessoal não pode ser nulo")
    @NotBlank(message = "O campo documento pessoal não pode estar vazio")
    private String documentoPessoal;

    public AutorDTO() {}

    public AutorDTO(Autor autor) {
        this.id = autor.getIdAutor();
        this.nome = autor.getNome();
        this.documentoPessoal = autor.getDocumentoPessoal();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumentoPessoal() {
        return documentoPessoal;
    }
}
