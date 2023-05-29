package com.futuroDev.labReceitas.models;

import jakarta.persistence.*;

// Classe que representa a tabela de categorias no banco de dados.
    @Entity
    @Table(name = "tb_categorias")
public class categorias {
        // Atributos da classe.
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "categoria_id",unique = true)
        private Long id;

        @Column(name = "nome", unique = true, nullable = false)
        private String nome;

        @Column(name = "descricao")
        private String descricao;

        // Construtores da classe.
        public categorias() {
        }

        public categorias(Long id, String nome, String descricao) {
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
        }

        // Getters e Setters.
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }
