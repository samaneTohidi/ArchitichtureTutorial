package com.example.architichturetutorial.Composite

class Student(private val stdId: Long, private val name: String, private val position: String) :
    Input90 {
    override fun showDetails() {
        System.out.println("$stdId $name")
    }

}