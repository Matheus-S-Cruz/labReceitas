package com.futuroDev.labReceitas.repository;

import com.futuroDev.labReceitas.models.receitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// Interface que extende JpaRepository, responsável por customizar as operações de CRUD no banco de dados.
@Repository
public interface receitasRepository extends JpaRepository<receitas, Long> {

    List<receitas> findByCategoriaEquals(long categoria);

    List<receitas> findByRestricaoEquals(boolean restricao);
}
