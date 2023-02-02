package com.filmes.poshyweb.dominio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;
@Entity
public class FilmesEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID id;
    @NotNull(message = "Nome do filme é obrigatorio!")
    private String nome;
    @NotNull(message = "Nome do Autor é obrigatorio!")
    private  String nomeDireto;
    @NotNull(message = "Ano é obrigatorio!")
    private String ano;
    @NotNull(message = "1 ou 5")
    @Min(1)
    @Max(5)
    private int nota;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmesEntity that = (FilmesEntity) o;
        return nota == that.nota && Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(nomeDireto, that.nomeDireto) && Objects.equals(ano, that.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nomeDireto, ano, nota);
    }

    @Override
    public String toString() {
        return "FilmesEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nomeDireto='" + nomeDireto + '\'' +
                ", ano=" + ano +
                ", nota=" + nota +
                '}';
    }
}
