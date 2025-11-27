package com.example.hilt_dependency_injection

fun main(){

    val engine = Engine()

    val car = Car(engine)

    car.drive()


}