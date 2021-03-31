package com.example.architichturetutorial.AbstractFactory

class VehicleFactory {
     fun getVehicle(vehicleType: String?): Vehicle? {
        if (vehicleType == null) {
            return null
        } else if (vehicleType == "Car") {
            return Car()
        } else if (vehicleType == "MotorCycle") {
            return MotorCycle()
        }
        return null
    }
}

class ColorFactory  {
    fun getColor(color: String?): Color? {
        if (color == null) {
            return null
        }
        if (color == "RED") {
            return Red()
        }
        return if (color == "BLUE") {
            Blue()
        } else null
    }
}