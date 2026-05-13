package com.apiRestCardapio.food;
//Declarar as propriedades que ela vai passar
public record FoodResponseDTO (Long id, String title , String image , Integer price ){


    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
