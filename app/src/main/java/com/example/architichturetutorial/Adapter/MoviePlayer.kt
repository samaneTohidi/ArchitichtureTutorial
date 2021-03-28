package com.example.architichturetutorial.Adapter

interface MoviePlayer {
    fun playVlc(mediaType: String, fileName: String)
    fun playMp4(mediaType: String, fileName: String)
}