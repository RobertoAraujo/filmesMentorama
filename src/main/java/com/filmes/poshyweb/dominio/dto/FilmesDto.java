package com.filmes.poshyweb.dominio.dto;

import com.filmes.poshyweb.dominio.entity.FilmesEntity;

public record FilmesDto(String nome, String nomeDireto, String ano) {
    public FilmesDto(FilmesEntity filmes) {
        this(filmes.getNome(), filmes.getAno(), filmes.getNomeDireto());
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public String nomeDireto() {
        return nomeDireto;
    }

    @Override
    public String ano() {
        return ano;
    }

    @Override
    public String toString() {
        return "FilmesDto{" +
                "nome='" + nome + '\'' +
                ", nomeDireto='" + nomeDireto + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
