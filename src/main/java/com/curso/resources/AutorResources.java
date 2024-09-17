package com.curso.resources;


import com.curso.domains.dtos.AutorDTO;
import com.curso.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/autor")
public class AutorResources {

    @Autowired
    private AutorService autorService;

    @GetMapping //exemplo : http://localhost:8080/autor
    public ResponseEntity<List<AutorDTO>> findAll() {
        return ResponseEntity.ok().body(autorService.findAll());
    }
}
