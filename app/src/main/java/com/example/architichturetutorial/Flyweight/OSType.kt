package com.example.architichturetutorial.Flyweight

enum class OSType {WIN , LIN , MAC}

data class OS(var name : OSType)

data class Computer(var os : OS , var ram : Int)