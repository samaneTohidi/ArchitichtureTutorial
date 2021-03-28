package com.example.architichturetutorial.Adapter

class MediaPlayer(var soundPlayer: SoundPlayer) {
    fun play(audioType: String, fileName: String) {
        soundPlayer.play(audioType,fileName)
    }
}