package com.futuroDev.labReceitas.repository;

import com.futuroDev.labReceitas.models.categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Interface que extende JpaRepository, responsável por customizar as operações de CRUD no banco de dados.
@Repository
public interface categoriasRepository extends JpaRepository<categorias, Long> {

}
