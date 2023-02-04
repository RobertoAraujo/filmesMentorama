package com.filmes.poshyweb.dominio.dto;

public record FilmesDto(String nome, String nomeDireto, String ano) {

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
