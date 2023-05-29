package com.futuroDev.labReceitas.models;


import jakarta.persistence.*;

// Classe que representa a tabela de receitas no banco de dados.
@Entity
@Table(name = "tb_receitas")
public class receitas {
    // Atributos da classe.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receita_id",unique = true)
    private Long id;

    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "ingredientes",nullable = false, unique = true)
    private String ingredientes;

    @Column(name = "modoPreparo", nullable = false, unique = true)
    private String modoPreparo;

    @Column(name = "restricao", nullable = false)
    private Boolean restricao;


    @Column(name = "categoria" )
    private Long categoria;

    // Construtores da classe.
    public receitas() {
    }

    public receitas(Long id, String nome, String ingredientes, String modoPreparo, Boolean restricao, Long categoria) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.restricao = restricao;
        this.categoria = categoria;
    }

    // Getters e Setters da classe.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoria() {
        return categoria;
    }

    public void setCategoria(Long categoriaId) {
        this.categoria = categoriaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public Boolean isRestricao() {
        return restricao;
    }

    public void setRestricao(Boolean restricao) {
        this.restricao = restricao;
    }

    public Boolean getRestricao() {
        return restricao;
    }

}
