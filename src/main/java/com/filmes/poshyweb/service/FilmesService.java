package com.filmes.poshyweb.service;

import com.filmes.poshyweb.dominio.dto.FilmesDto;
import com.filmes.poshyweb.dominio.entity.FilmesEntity;
import com.filmes.poshyweb.dominio.rapository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class FilmesService {
    @Autowired
    private FilmesRepository repository;

    public FilmesEntity insertFilmes(FilmesEntity filmes) {
        List<FilmesEntity> veioDoBanco = repository.findAll();
        if (veioDoBanco.equals(filmes.getNome() == filmes.getNome())){
            System.out.println("ja existe o nome desse filme!");
            return null;
        }else if (veioDoBanco.equals(filmes.getAno() == filmes.getAno())) {
            System.out.println("ja existe o ano desse filme!");
            return null;
        }else if (veioDoBanco.equals(filmes.getNomeDireto() == filmes.getNomeDireto())) {
            System.out.println("ja existe o nome desse direto!");
            return null;
        }else {
            return repository.save(filmes);
        }
    }

    public List<FilmesEntity> listFilmes() {
        return repository.findAll();
    }
}
