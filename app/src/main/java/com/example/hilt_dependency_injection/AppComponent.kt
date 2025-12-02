package com.example.hilt_dependency_injection

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun getCar(): Car                        // this interface defines the api for retrieving the dependencies from the dagger dep graph

}



/*

 @Component : it is like a bridge between the modules (which provides the dependencies) & the classes that need those dependencies

*/