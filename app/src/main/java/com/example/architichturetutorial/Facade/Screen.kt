package com.example.architichturetutorial.Facade

class Screen {
    var musicPlayer : MusicPlayer? = null
    var speaker : Speaker? = null

    fun showSongName(name : String){
        print("show {$name}")
    }

    fun playSong(songName : String){
        musicPlayer?.playSong(songName)
    }

    fun turnOffMusicPlayer(){
        musicPlayer?.off()
    }

    fun turnOnMusicPlayer(){
        musicPlayer?.on()
    }

    fun turnOffSpeaker(){
        speaker?.off()
    }

    fun turnOnSpeaker(){
        speaker?.on()
    }
}