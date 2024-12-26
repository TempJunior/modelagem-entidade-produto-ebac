package br.com.tempjunior.service;

import br.com.tempjunior.dao.ProdutoDAO;
import br.com.tempjunior.entity.Produto;
import br.com.tempjunior.util.JPAUtil;

import javax.persistence.EntityManager;

public class ProdutoService {
    private EntityManager em = JPAUtil.getEntityManager();

    ProdutoDAO dao = new ProdutoDAO(em);

    public void cadastrar(Produto produto) {
        try {
            em.getTransaction().begin();
            dao.cadastrar(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
