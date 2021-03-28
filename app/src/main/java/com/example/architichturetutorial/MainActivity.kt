package com.example.architichturetutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.architichturetutorial.Adapter.AudioPlayer
import com.example.architichturetutorial.Adapter.MediaPlayer
import com.example.architichturetutorial.Adapter.SoundAdapter
import com.example.architichturetutorial.ObjectPool.ComputerObjectPool
import com.example.architichturetutorial.Prototype.ShapeCloneMaker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usePrototype()
        useObjectPool()
        useAdapter()
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


    fun useAdapter(){
        val audioPlayer = AudioPlayer()
        val mediaPlayer_1 = MediaPlayer(audioPlayer)

        mediaPlayer_1.play("mp3","Du hast")

        val soundAdapter = SoundAdapter()
        val mediaPlayer_2 = MediaPlayer(soundAdapter)

        mediaPlayer_2.play("vlc","Pulp Fiction")

    }
}

