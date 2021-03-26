package com.example.architichturetutorial

import kotlin.jvm.Throws

class ShapeClone(var name : String) : Cloneable {
    @Throws(CloneNotSupportedException::class)

    public override fun clone(): Any {

        return super.clone()

    }

}


