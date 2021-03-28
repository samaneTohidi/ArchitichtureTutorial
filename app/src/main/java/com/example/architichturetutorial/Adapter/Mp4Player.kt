package com.example.architichturetutorial.Adapter



class Mp4Player: MoviePlayer {

    override fun playVlc(mediaType: String, fileName: String) {
        TODO("Not yet implemented")
    }

    override fun playMp4(mediaType: String, fileName: String) {
        if(mediaType.equals("mp4"))
            println("Playing mp4 file. Name: $fileName")
        else
            println("Invalid media. $mediaType format not supported")
    }
}