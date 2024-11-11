package com.curso.resources;



import com.curso.domains.Livro;
import com.curso.domains.dtos.LivroDTO;
import com.curso.repository.LivroRepository;
import com.curso.services.LivroService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

@GetMapping(value = "/{id}") //exemplo: http://localhost:8080/produto/1
public ResponseEntity<LivroDTO> findById(@PathVariable long id){
Livro obj = this.livroService.findbyId(id);
return ResponseEntity.ok().body(new LivroDTO(obj));
}

 @GetMapping(value = "/isbn/{isbn}") //exemplo: http://localhost:8080/isbn/
 public ResponseEntity<LivroDTO> findByIsbn(@PathVariable String isbn){
  Livro obj = this.livroService.findbyisbn(isbn);
  return ResponseEntity.ok().body(new LivroDTO(obj));
 }




}
