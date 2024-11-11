package com.curso.services;

import com.curso.domains.Autor;
import com.curso.domains.Livro;
import com.curso.domains.dtos.AutorDTO;
import com.curso.domains.dtos.EditoraDTO;
import com.curso.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class AutorService {

@Autowired
private AutorRepository autorRepository;

public List<AutorDTO> findAll() {

return autorRepository.findAll().stream()
        .map(obj -> new AutorDTO(obj))
        .collect(Collectors.toList());
 }
 public Autor findbyId(Integer id){
  Optional<Autor> obj = autorRepository.findById(id);
  return obj.orElse(null);
 }





}
