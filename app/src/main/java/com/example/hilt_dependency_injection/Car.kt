package com.example.hilt_dependency_injection

import javax.inject.Inject


// dependent on engine

// dependency is passed from outside the class, and hilt handles injecting it

class Car @Inject constructor( private val engine: Engine ) {

    fun drive(){
        println(engine.start())
    }

}





/*

  dependency is created in class => for every other class we will have to create
  dependency (val engine) to use it, its not most reliable way

  private val engine = Engine()          -> it's a dependency, "engine" depends on "Engine()"

  */