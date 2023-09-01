package com.loja;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    /**
     * No construtor a Lista de produtos
     * será preenchida :)
     */

    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis Faber Castel", "Lapis Faber Castel Comum", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Apontador comum com reservátorio", 7.99);
        Produto caderno = new Produto(5, "Caderno espiral", "Caderno espiral de 96 folhas", 15.99);
        Produto lapiseria = new Produto(6, "Lapiseira Pentel", "Lapiseira Pentel 2.0", 19.08);
        Produto marcadordetexto = new Produto(7, "Marcador de Texto Stabilo", "Marcador de Texto na cor Rosa da marca Stabilo", 10.90);
        Produto estojo = new Produto(8, "Estojo Academie", "Estojo Academie na cor Preto", 89.90);
        Produto lapisdecor = new Produto(9, "Lapis de Cor Faber Castel", "Lapis de Cor Faber Castel Comum 24 cores", 36.90);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);

    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    /**
     * método que retorna todos os produtos da Lista
     */

    public List<Produto> buscarTodosOsProdutos(){return this.getProdutos(); }

    /**
     * Método que buscar um produto pelo seu ID
     * Caso não encontre vai retornar nulo
     * @param produtoId
     * @return
     */


    public Produto buscarProdutoPeloId(int produtoId){
        Produto produtoProcurado = null;
        for (Produto p: this.produtos){
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }
}
