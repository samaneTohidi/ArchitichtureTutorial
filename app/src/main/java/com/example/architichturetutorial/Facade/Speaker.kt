package com.example.architichturetutorial.Facade

class Speaker {
    var on = false

    fun playSound(name : String){
        if(on){
            print("show {$name}")
        }
    }

    fun on(){
        on = true
    }

    fun off(){
        on = false
    }
}