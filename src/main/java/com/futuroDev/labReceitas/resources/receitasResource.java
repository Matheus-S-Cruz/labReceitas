package com.futuroDev.labReceitas.resources;

import com.futuroDev.labReceitas.models.receitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.futuroDev.labReceitas.repository.receitasRepository;

import java.util.List;
import java.util.Optional;

// Classe responsável por realizar as operações de CRUD no banco de dados.
@RestController
@RequestMapping(value ="/receitas")
public class receitasResource {

    @Autowired
    receitasRepository receitasRepository;

    // Método responsável por listar todas as receitas.
    @GetMapping("/listarReceitas")
    public List<receitas> listarReceitas() {
        return receitasRepository.findAll();
    }

    // Método responsável por deletar uma receita específica.
    @DeleteMapping("/deletarReceita/{id}")
    public void deletarReceita(@PathVariable(value = "id") long id) {
        receitasRepository.deleteById(id);
    }

    // Método responsável por listar receitas por categoria.
    @GetMapping("/listarPorCategoria/{categoria}")
    public List<receitas> listarPorCategoria(@PathVariable(value = "categoria") long categoria) {
        return receitasRepository.findByCategoriaEquals(categoria);
    }

    // Método responsável por listar receitas por restrição.
    @GetMapping("/listarPorRestricao/{restricao}")
    public List<receitas> listarPorRestricao(@PathVariable(value = "restricao") boolean restricao) {
        return receitasRepository.findByRestricaoEquals(restricao);
    }

    // Método responsável por criar uma receita.
    @PostMapping("/criarReceita")
    public receitas criarReceita(@RequestBody receitas receita) {
        return receitasRepository.save(receita);
    }

    // Método responsável por atualizar uma receita.
    @PutMapping("/atualizarReceita/{id}")
    public receitas atualizarReceita(@PathVariable(value = "id") long id, @RequestBody receitas receita) {
        Optional<receitas> receitaOptional = receitasRepository.findById(id);
        receitas receitaAtualizada = receitaOptional.get();
        receitaAtualizada.setNome(receita.getNome());
        receitaAtualizada.setIngredientes(receita.getIngredientes());
        receitaAtualizada.setModoPreparo(receita.getModoPreparo());
        receitaAtualizada.setRestricao(receita.getRestricao());
        receitaAtualizada.setCategoria(receita.getCategoria());
        return receitasRepository.save(receitaAtualizada);
    }




}

