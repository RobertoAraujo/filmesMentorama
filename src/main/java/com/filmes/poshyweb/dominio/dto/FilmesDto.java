package com.filmes.poshyweb.dominio.dto;

import java.util.Objects;

public class FilmesDto {
    private String nome;
    private String nomeDireto;
    private String ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDireto() {
        return nomeDireto;
    }

    public void setNomeDireto(String nomeDireto) {
        this.nomeDireto = nomeDireto;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmesDto filmesDto = (FilmesDto) o;
        return Objects.equals(nome, filmesDto.nome) && Objects.equals(nomeDireto, filmesDto.nomeDireto) && Objects.equals(ano, filmesDto.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nomeDireto, ano);
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
