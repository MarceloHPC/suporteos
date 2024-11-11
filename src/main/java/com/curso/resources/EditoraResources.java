package com.curso.resources;

import com.curso.domains.Editora;
import com.curso.domains.dtos.EditoraDTO;
import com.curso.services.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping(value = "/editora")
public class EditoraResources {

    @Autowired
    private EditoraService editoraService;

    @GetMapping  //exemplo : http://localhost:8080/editora
    public ResponseEntity<List<EditoraDTO>> findAll() {
        return ResponseEntity.ok().body(editoraService.findAll());
    }


    @GetMapping(value = "/{id}") //exemplo: http://localhost:8080/produto/1
    public ResponseEntity<EditoraDTO> findById(@PathVariable Integer id){
        Editora obj = this.editoraService.findbyId(id);
        return ResponseEntity.ok().body(new EditoraDTO(obj));
    }

    @GetMapping(value = "/{cnpj}") //exemplo: http://localhost:8080/isbn/
    public ResponseEntity<EditoraDTO> findByIsbn(@PathVariable String cnpj){
        Editora obj = this.editoraService.findbycnpj(cnpj);
        return ResponseEntity.ok().body(new EditoraDTO(obj));
    }




}

