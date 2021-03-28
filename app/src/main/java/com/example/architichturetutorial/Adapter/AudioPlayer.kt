package com.example.architichturetutorial.Adapter

class AudioPlayer: SoundPlayer {

    override fun play(audioType: String, fileName: String) {

        if (audioType.equals("mp3", ignoreCase = true)) {
            println("Playing mp3 file. Name: $fileName")
        }  else {
            println("Invalid media. $audioType format not supported")
        }
    }
}