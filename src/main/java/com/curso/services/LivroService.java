package com.curso.services;



import com.curso.domains.dtos.LivroDTO;
import com.curso.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {

@Autowired
private LivroRepository livroRepository;

public List<LivroDTO> findAll() {
//retorna uma lista de ProdutoDTO
    return livroRepository.findAll().stream()
            .map(obj -> new LivroDTO(obj))
            .collect(Collectors.toList());
}

}
