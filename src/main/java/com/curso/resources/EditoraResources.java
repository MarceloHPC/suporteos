package com.curso.resources;

import com.curso.domains.Editora;
import com.curso.domains.dtos.EditoraDTO;
import com.curso.services.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/editora")
public class EditoraResources {

    @Autowired
    private EditoraService editoraService;

    @GetMapping  //exemplo : http://localhost:8080/editora
    public ResponseEntity<List<EditoraDTO>> findAll() {
        return ResponseEntity.ok().body(editoraService.findAll());
    }
}

