package com.example.architichturetutorial.Adapter



class VlcPlayer: MoviePlayer {
    override fun playVlc(mediaType: String, fileName: String) {
        if(mediaType.equals("vlc"))
            println("Playing vlc file. Name: $fileName")
        else
            println("Invalid media. $mediaType format not supported")
    }

    override fun playMp4(mediaType: String, fileName: String) {
        TODO("Not yet implemented")
    }
}