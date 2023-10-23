package com.compose.unittestproj

class Engine (
    val cc: Int,
    val hoursePower: Int,
    var temperature: Int,
    var isTurnOn: Boolean)
{
    fun turnOn(){
        isTurnOn = true
        temperature = 95
    }
    fun turnOff(){
        isTurnOn = false
        temperature = 15
    }
}


