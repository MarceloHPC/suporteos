package com.curso.services;

import com.curso.domains.Autor;
import com.curso.domains.Editora;
import com.curso.domains.Livro;
import com.curso.enums.Conservacao;
import com.curso.enums.Status;
import com.curso.repository.AutorRepository;
import com.curso.repository.EditoraRepository;
import com.curso.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private EditoraRepository editoraRepository;

    public void initDB() {

        Autor autor1 = autorRepository.save(new Autor("Machado de Assis", "12345678901"));
        Autor autor2 = autorRepository.save(new Autor("Clarice Lispector", "98765432101"));
        Autor autor3 = autorRepository.save(new Autor("Graciliano Ramos", "19283746509"));


        Editora editora1 = editoraRepository.save(new Editora("Editora Rocco", "12.345.678/0001-99"));
        Editora editora2 = editoraRepository.save(new Editora("Editora Todavia", "98.765.432/0001-88"));
        Editora editora3 = editoraRepository.save(new Editora("Editora Cepal", "98.765.432/0001-88"));


        Livro livro1 = new Livro("Dom Casmurro", 1, "978-3-16-148410-0", 256, LocalDate.now(),
                new BigDecimal("29.90"), Conservacao.GASTO, Status.LIDO, editora1, autor1);

        Livro livro2 = new Livro("A Hora da Estrela", 2, "978-0-12-345678-9", 192, LocalDate.now(),
                new BigDecimal("19.90"), Conservacao.BOM, Status.LENDO, editora1, autor2);

        Livro livro3 = new Livro("Vidas Secas", 3, "978-0-123456-78-6", 304, LocalDate.now(),
                new BigDecimal("25.95"), Conservacao.EXCELENTE, Status.NAOLIDO, editora2, autor3);


        livroRepository.save(livro1);
        livroRepository.save(livro2);
        livroRepository.save(livro3);


        Livro novoLivro = new Livro("Livro Fictício", 4, "978-1-23-456789-0", 300, LocalDate.now(),
                new BigDecimal("49.90"), Conservacao.MARCASDEUSO, Status.LIDO, editora1, autor2);

        livroRepository.save(novoLivro);


        System.out.println("Autor 1 ID: " + autor1.getIdAutor());
        System.out.println("Autor 2 ID: " + autor2.getIdAutor());
        System.out.println("Autor 3 ID: " + autor3.getIdAutor());
        System.out.println("Editora 1 ID: " + editora1.getIdEditora());
        System.out.println("Editora 2 ID: " + editora2.getIdEditora());
    }
}