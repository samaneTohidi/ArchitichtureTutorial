package com.example.architichturetutorial.Adapter

class SoundAdapter: SoundPlayer {
    var moviePlayer: MoviePlayer? = null
    var audioPlayer: SoundPlayer? = null
    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("mp3")){
            audioPlayer = AudioPlayer()
            audioPlayer!!.play(audioType,fileName)
        }
        if (audioType.equals("vlc")) {
            moviePlayer = VlcPlayer()
            moviePlayer!!.playVlc(audioType,fileName)
        } else if (audioType.equals("mp4")) {
            moviePlayer = Mp4Player()
            moviePlayer!!.playMp4(audioType,fileName)
        }
    }
}