package com.example.architichturetutorial.Flyweight

object OSSharedVars {
    private var osMap = HashMap<OSType, OS>()
    fun getOS(type : OSType) : OS{
        var os = osMap.get(type)
        if(os == null){
            os = OS(type)
            osMap.put(type,os)
        }
        return os
    }
}