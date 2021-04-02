package com.example.architichturetutorial.Facade

class MusicPlayer() {

    var on = false

    var song : String? = null
    var screen: Screen? = null
    var speaker : Speaker? = null

    fun playSong(songName : String){
        if(on){
            song = songName
            screen?.showSongName(songName)
            speaker?.playSound(songName)
        }
    }

    fun on(){
        on = true
    }

    fun off(){
        on = false
    }
}