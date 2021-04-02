package com.example.architichturetutorial.Observer

internal class Subject {
    private val observers: MutableList<Observer> = ArrayList()
    private var state = 0

    fun add(o: Observer) {
        observers.add(o)
    }

    fun getState(): Int {
        return state
    }

    fun setState(value: Int) {
        state = value
        execute()
    }

    private fun execute() {
        for (observer in observers) {
            observer.update()
        }
    }
}