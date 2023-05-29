package com.futuroDev.labReceitas.resources;

import com.futuroDev.labReceitas.models.categorias;
import com.futuroDev.labReceitas.models.receitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.futuroDev.labReceitas.repository.categoriasRepository;
import com.futuroDev.labReceitas.repository.receitasRepository;

import java.util.List;


// Classe responsável por realizar as operações de CRUD no banco de dados.
@RestController
@RequestMapping(value ="/categorias")
public class categoriasResource {
    // Anotação que indica que a variável será instanciada automaticamente.
    @Autowired
    categoriasRepository categoriasRepository;

    @Autowired
    receitasRepository receitasRepository;

    // Método responsável por listar todas as categorias.
    @GetMapping ("/listarCategorias")
    public List<categorias> listarCategorias() {
        return categoriasRepository.findAll();
    }

    // Método responsável por deletar uma categoria específica.
    @DeleteMapping("/deletarCategoria/{id}")
    public void deletarCategoria(@PathVariable(value = "id") long id) {
        List<receitas> receitaOptional = receitasRepository.findByCategoriaEquals(id);
        if(receitaOptional.isEmpty()){
            categoriasRepository.deleteById(id);
        }
        else {
            System.out.println("Não é possível deletar uma categoria que possui receitas");
        }

    }

}
