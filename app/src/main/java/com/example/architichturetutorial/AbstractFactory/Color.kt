package com.example.architichturetutorial.AbstractFactory

interface Color {
    fun fill()

}

class Blue : Color {
    override fun fill() {
        println("Color : Blue")
    }
}

class Red : Color {
    override fun fill() {
        println("Color : Red")
    }
}