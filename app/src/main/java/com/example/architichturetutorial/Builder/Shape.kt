package com.example.architichturetutorial.Builder

interface ShapeBuilderInterface {
       fun addColor(color: Int)
       fun addName(name:String)
    }
class Shape private constructor(shapeBuilder: ShapeBuilder) {
       var perimeter: Float = 0f
       var area: Float = 0f
        var color: Int = 0
        var name: String = "undefind"

        class ShapeBuilder(private val perimeter: Float, private val area: Float): ShapeBuilderInterface {
                var color: Int = 0
                var name: String? = "undefind"

                override fun addColor(color: Int) {
                        this.color = color
                    }

                override fun addName(name: String) {
                        this.name = name
                    }

                fun build(): Shape {
                        return Shape(this)
                    }

           }
    }
