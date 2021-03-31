package com.example.architichturetutorial.AbstractFactory

interface Vehicle {
    fun showVehicleType()

}

class Car : Vehicle {
    override fun showVehicleType() {
        println("Vehicle: Car")
    }
}

class MotorCycle : Vehicle {
    override fun showVehicleType() {
        println("Vehicle: MotorCycle")
    }
}