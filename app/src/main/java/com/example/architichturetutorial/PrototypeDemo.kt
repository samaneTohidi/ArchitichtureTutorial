package com.example.architichturetutorial

class PrototypeDemo {
    fun doClone() {
        val cloneMaker = ShapeCloneMaker()
        val circle = cloneMaker.getShape("Circle")
    }
}