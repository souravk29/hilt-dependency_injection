package com.example.hilt_dependency_injection

fun main(){


//    Hilt/Dagger  generates the DaggerAppComponent class at  compile-time


   val appComponent: AppComponent =
            DaggerAppComponent.create()                         // generates java folder in app


    // retrieve the car instance

    val car: Car = appComponent.getCar()


    // use the car

    println(car.drive())

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