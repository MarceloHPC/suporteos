package com.curso.resources;



import com.curso.domains.dtos.LivroDTO;
import com.curso.repository.LivroRepository;
import com.curso.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/livro")
public class LivroResources {

@Autowired
private LivroService livroService;

@GetMapping  //exemplo : http://localhost:8080/livro
public ResponseEntity<List<LivroDTO>> findAll() {
 return ResponseEntity.ok().body(livroService.findAll());
  }
}
