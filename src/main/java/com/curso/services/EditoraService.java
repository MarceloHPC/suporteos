package com.curso.services;



import com.curso.domains.dtos.EditoraDTO;
import com.curso.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;



@Service
public class EditoraService {

@Autowired
private EditoraRepository editoraRepository;

public List<EditoraDTO> findAll() {

return editoraRepository.findAll().stream()
   .map(obj ->new EditoraDTO(obj))
    .collect(Collectors.toList());
}








}
