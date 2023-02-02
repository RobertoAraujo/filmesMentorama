package com.filmes.poshyweb.controller;

import com.filmes.poshyweb.dominio.entity.FilmesEntity;
import com.filmes.poshyweb.service.FilmesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controler/v1")
public class FilmesController {
    @Autowired
    private FilmesService service;

    @PostMapping("/insert")
    public ResponseEntity insertFilmes(@RequestBody @Valid FilmesEntity filmes) {
        FilmesEntity filmesEntity = service.insertFilmes(filmes);
        return ResponseEntity.ok().body(filmesEntity);
    }

    @GetMapping("/list")
    public ResponseEntity listFilmes() {
        List<FilmesEntity> listFilmesEntities = service.listFilmes();
        return ResponseEntity.ok().body(listFilmesEntities);
    }
}
