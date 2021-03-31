package com.example.architichturetutorial.AbstractFactory


abstract class AbstractFactory {
    abstract fun getMachineFactory(): VehicleFactory
    abstract fun getColorFactory(): ColorFactory

}

class FactoryProducer: AbstractFactory() {
    override fun getMachineFactory(): VehicleFactory {
        return VehicleFactory()
    }

    override fun getColorFactory(): ColorFactory {
        return ColorFactory()
    }

}