package com.curso.services;



import com.curso.domains.Editora;
import com.curso.domains.dtos.EditoraDTO;
import com.curso.repository.EditoraRepository;
import com.curso.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



@Service
public class EditoraService {

@Autowired
private EditoraRepository editoraRepository;

public List<EditoraDTO> findAll() {

return editoraRepository.findAll().stream()
   .map(obj -> new EditoraDTO(obj))
    .collect(Collectors.toList());
}

    public Editora findbyId(Integer id){
        Optional<Editora> obj = editoraRepository.findById(id);
        return obj.orElse(null);
    }

    public Editora findbycnpj(String cnpj){
        Optional<Editora> obj = editoraRepository.findByCnpj(cnpj);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Editora nao encontrada! CNPJ:"+cnpj));
    }




}
