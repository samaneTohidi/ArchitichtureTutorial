package com.example.architichturetutorial

class ShapeCloneMaker {

    val shapeMap = HashMap<String, ShapeClone>()
    init {
        shapeMap["Circle"] = ShapeClone("Circle")
        shapeMap["Oval"] = ShapeClone("Oval")
    }

    fun getShape(key: String) : ShapeClone?{
        if(shapeMap.contains(key)){
            return (shapeMap[key]!!.clone() as ShapeClone)
        }
        return null
    }
}

