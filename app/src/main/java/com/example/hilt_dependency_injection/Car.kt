package com.example.hilt_dependency_injection

class Car( private val engine: Engine ) {

    /*

    dependency is created in class => for every other class we will have to create
    dependency (val engine) to use it, its not most reliable way

    private val engine = Engine()      -> it's a dependency, "engine" depends on "Engine()"

    */

    fun drive(){
        println(engine.start())
    }

}