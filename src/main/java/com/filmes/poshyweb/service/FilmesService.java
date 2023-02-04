package com.filmes.poshyweb.service;

import com.filmes.poshyweb.dominio.dto.FilmesDto;
import com.filmes.poshyweb.dominio.entity.FilmesEntity;
import com.filmes.poshyweb.dominio.rapository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {
    @Autowired
    private FilmesRepository repository;

    public ResponseEntity<String> insertFilmes(FilmesEntity filmes, FilmesDto dto) {
        if (dto.nome() == filmes.getNome()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ja existe o nome desse filme!");

        } else if (dto.ano() == filmes.getNome()) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ja existe o ano desse filme!");

        } else if (dto.nomeDireto() == filmes.getNomeDireto()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ja existe o nome desse direto!");

        } else {
            FilmesEntity filmesSalvo = repository.save(filmes);
            return ResponseEntity.ok("criou!");
        }
    }

    public List<FilmesEntity> listFilmes() {
        return repository.findAll();
    }
}
