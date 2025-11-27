package com.example.hilt_dependency_injection

class Car {

    private val engine = Engine()

    fun drive(){
        println(engine.start())
    }

}