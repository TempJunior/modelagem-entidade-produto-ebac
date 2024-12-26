package br.com.tempjunior.dao;

import br.com.tempjunior.entity.Produto;

import javax.persistence.EntityManager;

public class ProdutoDAO implements IProdutoDAO<Produto>{
    private EntityManager em;

    @Override
    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }
}
