package com.filmes.poshyweb.dominio.rapository;

import com.filmes.poshyweb.dominio.entity.FilmesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FilmesRepository extends JpaRepository<FilmesEntity, UUID> {

}
