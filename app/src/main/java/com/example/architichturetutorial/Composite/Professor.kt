package com.example.architichturetutorial.Composite

class Professor(private val prfId: Long, private val name: String, private val position: String) :
    Input90 {
    override fun showDetails() {
        System.out.println("$prfId $name")
    }

}