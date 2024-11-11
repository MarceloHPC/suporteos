package com.curso.services;


import com.curso.domains.Livro;
import com.curso.domains.dtos.LivroDTO;
import com.curso.repository.LivroRepository;
import com.curso.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
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

public Livro findbyId(long id){
    Optional<Livro> obj = livroRepository.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException("Livro nao encontrado! Id:"+id));
}

    public Livro findbyisbn(String isbn){
        Optional<Livro> obj = livroRepository.findByIsbn(isbn);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Livro nao encontrado! Isbn:"+isbn));
    }




}
