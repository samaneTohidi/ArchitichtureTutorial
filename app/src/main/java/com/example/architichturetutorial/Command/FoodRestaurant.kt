package com.example.architichturetutorial.Command

interface FoodRestaurant {
    fun cook()
}


class PersianFood:FoodRestaurant{
    override fun cook() {
        TODO("Not yet implemented")
    }

}

class FastFood: FoodRestaurant{
    override fun cook() {
        TODO("Not yet implemented")
    }

}

abstract class Order(var foodRestaurant: FoodRestaurant){
        abstract fun instruction()
    }


class Rice(foodRestaurant: FoodRestaurant): Order(foodRestaurant){
    override fun instruction() {
    foodRestaurant.cook()
    }


}


class Pizaa(foodRestaurant: FoodRestaurant): Order(foodRestaurant){
    override fun instruction() {
    foodRestaurant.cook()
    }

}

class Invoker(var order: Order){
    fun waiter(){
       order.instruction()
    }
}