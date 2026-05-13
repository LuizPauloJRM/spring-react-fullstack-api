package com.apiRestCardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Entidade do banco
@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    //Colunas no banco
    //Chave das unidades automáticamente
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Atributos
    private String title;
    private String image ;
    private Integer price;


    //Construtor
    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }

}
