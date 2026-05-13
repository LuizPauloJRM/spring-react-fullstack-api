package com.apiRestCardapio.controller;

import com.apiRestCardapio.food.Food;
import com.apiRestCardapio.food.FoodRepository;
import com.apiRestCardapio.food.FoodRequestDTO;
import com.apiRestCardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Indicar que esta classe é um controler da nossa aplicação
//Com request mapping mapeando o endpointer
//Retorna tudo que esta no banco de dados
@RestController
@RequestMapping("food")
public class FoodController {
    //Quando indicar um método desta classe vamos usar este método

    //Declarando a instancia , injetando a dependencia
    @Autowired
    private FoodRepository repository;

    //Metodo para receber produtos
    //Mapeamento tipo Post
    //Pegar body atraves do parametros

    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void  saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return ;

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
@GetMapping
public List <FoodResponseDTO> getAll(){
    //Coloca dados dentro do funil stream
    //Retornando Data Object Transfer ao inves de retornar entidade
    List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
    return foodList;

    }
}
   //@GetMapping
    //public List<Food> getAll(){
        //Vamos retornar com DTO


        //Classe Entity representa tabela no banco de dados
        //Todos os dados dentro da tabela Food
        //Lista acessando o repository
       // List<Food> foodList = repository.findAll();
        //return foodList;

    //}
//}



