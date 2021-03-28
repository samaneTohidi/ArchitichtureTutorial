package com.example.architichturetutorial.ObjectPool

import com.example.architichturetutorial.Flyweight.OS

class Computer(os: OS, ram: Int) {
    var pluggedIn = true

}

class ComputerObjectPool : ObjectPool<Computer>(){

    override fun create(): Computer = Computer(getOS(OSType.WIN), ram)

    override fun validate(obj: Computer): Boolean = obj.pluggedIn

    override fun expire(obj: Computer) {
        obj.pluggedIn = false
    }

}