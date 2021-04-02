package com.example.architichturetutorial.Observer

internal class HexObserver(subject: Subject?) :
    Observer() {
    override fun update() {
        print(" " + Integer.toHexString(subject!!.state))
    }

    init {
        this.subject = subject
        this.subject!!.add(this)
    }
}

internal class OctObserver(subject: Subject?) :
    Observer() {
    override fun update() {
        print(" " + Integer.toOctalString(subject!!.state))
    }

    init {
        this.subject = subject
        this.subject!!.add(this)
    }
}

internal class BinObserver(subject: Subject?) :
    Observer() {
    override fun update() {
        print(" " + Integer.toBinaryString(subject!!.state))
    }

    init {
        this.subject = subject
        this.subject!!.add(this)
    }
}