package com.curso.repository;


import com.curso.domains.Editora;
import com.curso.domains.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {

    Optional<Editora> findByCnpj(String CNPJ);
}