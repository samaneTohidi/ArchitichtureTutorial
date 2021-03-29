package com.example.architichturetutorial.ObjectPool

import com.example.architichturetutorial.Flyweight.OS
import com.example.architichturetutorial.Flyweight.OSSharedVars.getOS
import com.example.architichturetutorial.Flyweight.OSType

class Computer(os: OS, ram: Int) {
    var pluggedIn = true

}

class ComputerObjectPool : ObjectPool<Computer>(){

    override fun create(): Computer = Computer(getOS(OSType.WIN), ram = 1)

    override fun validate(obj: Computer): Boolean = obj.pluggedIn

    override fun expire(obj: Computer) {
        obj.pluggedIn = false
    }

}