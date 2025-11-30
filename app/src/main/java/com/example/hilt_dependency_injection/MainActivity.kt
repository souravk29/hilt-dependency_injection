package com.example.hilt_dependency_injection

fun main(){

    val engine = Engine()

    val car = Car(engine)

    car.drive()


}



/*

Dependency Injection:

   the most reliable way is to create dependencies
   externally and then feed it to the classes.



Hilt:

   A DI library built on Dagger that simplifies the dependency
   injection in android projects.



Component:

    A container that knows how to provide dependencies ( singleton component, activity component )


Module:

    A class that provides dependencies using @Module and @Provides

*/