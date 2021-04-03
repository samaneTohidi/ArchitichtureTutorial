package com.example.architichturetutorial.Command

import android.graphics.Color
import java.util.*

interface Command {
    fun execute()
    fun undo()
}

class Light {
    var color : Int = Color.WHITE

    fun red(){
        color = Color.RED
    }
    fun blue(){
        color = Color.BLUE
    }
    fun white(){
        color = Color.WHITE
    }
}

abstract class LightCommandMother (var light: Light) : Command {
    var lastStatus : Int = light.color

    override fun undo() {
        light.color = lastStatus
    }
}

class LightBlueCommand (light: Light) : LightCommandMother(light) {

    override fun execute() {
        light.blue()
    }
}

class LightWhiteCommand (light: Light) : LightCommandMother(light) {

    override fun execute() {
        light.white()
    }
}

class LightRedCommand (light: Light) : LightCommandMother(light) {

    override fun execute() {
        light.red()
    }
}

class RemoteControl {
    private val commandStack: Stack<Command> = Stack()

    fun pressButton(command: Command) {
        command.execute()
        commandStack.push(command)
    }

    fun undoButton(){
        if(!commandStack.isEmpty()){
            val lastCommand = commandStack.pop()
            lastCommand.undo()
        }
    }
}