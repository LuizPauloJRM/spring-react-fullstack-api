package com.apiRestCardapio.food;

import jakarta.persistence.*;

//Entidade do banco
@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    //Colunas no banco

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String image ;
    private Integer price;


}
