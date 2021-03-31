package com.example.architichturetutorial.Factory

class VehicleFactory {
    fun createVehicle(vehicleType: String?): Vehicle? {
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