package com.example.architichturetutorial.Strategy

interface Strategy {

    fun action (list: List<Int>): List<Int>
}

public class SortAscendStrategy: Strategy{
    override fun action(list: List<Int>): List<Int> {
        return list.sortedBy { it }
    }

}

public class SortDescendStrategy: Strategy{

    override fun action(list: List<Int>): List<Int> {
        return list.sortedByDescending { it }
    }

}

public class RemoveZerosStrategy: Strategy{
    override fun action(list: List<Int>): List<Int> {
        val tempList = list.toMutableList()
        tempList.removeAll { it == 0 }
        return tempList

    }

}

public class contextStrategy(var strategy: Strategy, var list: List<Int>){

    fun doStrategy (): List<Int>{
        return strategy.action(list)
    }
}