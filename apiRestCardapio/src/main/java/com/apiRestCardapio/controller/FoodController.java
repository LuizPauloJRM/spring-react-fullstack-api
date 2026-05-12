package com.apiRestCardapio.controller;

import com.apiRestCardapio.food.Food;
import com.apiRestCardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Indicar que esta classe é um controler da nossa aplicação
//Com request mapping mapeando o endpointer
//Retorna tudo que esta no banco de dados
@RestController
@RequestMapping("food")
public class FoodController {
    //Quando indicar um método desta classe vamos usar este método

    @Autowired
    private FoodRepository repository;


    @GetMapping
    public List<Food> getAll(){

        //Classe Entity representa tabela no banco de dados
        List<Food> foodList = repository.findAll();
        return foodList;

    }
}
