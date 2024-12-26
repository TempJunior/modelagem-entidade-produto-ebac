package br.com.tempjunior;

import br.com.tempjunior.entity.Produto;
import br.com.tempjunior.service.ProdutoService;

public class Main {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        Produto ps5 = new Produto("PS5", 5.400);
        service.cadastrar(ps5);
    }
}