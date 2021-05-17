package drogaria.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;


@Data
@Entity
@Table(name = "produto")
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Short codigo;
    @Column(length = 50, nullable = false,unique = true)
    private String nome;
    @Column(nullable = false)
    private Integer quantidade;
    @Column(nullable = false,precision = 5,scale = 2)
    private BigDecimal preco;
    @Column
    private LocalDate dataValidade;
}