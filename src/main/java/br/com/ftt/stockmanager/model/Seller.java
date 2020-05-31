package br.com.ftt.stockmanager.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
}
