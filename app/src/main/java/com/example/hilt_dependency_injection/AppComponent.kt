package com.example.hilt_dependency_injection

import dagger.Component
import javax.inject.Singleton



/*

This snippet is a definition of a Dagger Component. In the context of Android development (and Kotlin/Java in general),
Dagger is a Dependency Injection (DI) framework, and the Component is the most critical piece of the puzzle.

*/


@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun getCar(): Car                        // this interface defines the api for retrieving the dependencies from the dagger dependency graph


}



/*

 @Component : it is like a bridge between the modules (which provides the dependencies) & the classes that need those dependencies

*/

/*

@Component(modules = [AppModule::class])  :

This is the heart of the definition.

The Annotation: By marking the interface with @Component, you are telling Dagger: "Please generate code that implements this interface for me."

The Modules: modules = [AppModule::class] tells Dagger where to look for "recipes" or instructions on how to create objects.

Dagger will look inside AppModule to find functions annotated with @Provides to figure out how to build the dependencies needed for the graph.


*/