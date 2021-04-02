package com.example.architichturetutorial.Observer

internal abstract class Observer {
    protected var subject: Subject? = null
    abstract fun update()
}