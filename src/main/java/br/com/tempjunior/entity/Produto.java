package br.com.tempjunior.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_produto")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "valor", nullable = false)
    private Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
