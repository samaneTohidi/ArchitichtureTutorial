package com.example.architichturetutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.architichturetutorial.ObjectPool.ComputerObjectPool
import com.example.architichturetutorial.Prototype.ShapeCloneMaker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usePrototype()
        useObjectPool()
    }

    fun usePrototype() {
        val cloneMaker = ShapeCloneMaker()
        val circle = cloneMaker.getShape("Circle")
    }

   fun useObjectPool(){
       val objectPool = ComputerObjectPool()
       objectPool.create()
       objectPool.create()
       objectPool.create()

       val mohammadComputer = objectPool.checkOut()
       val aliComputer = objectPool.checkOut()

       objectPool.checkIn(mohammadComputer)
   }
}

