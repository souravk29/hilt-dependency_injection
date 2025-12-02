package com.example.hilt_dependency_injection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


// Hilt Module : defines how dependencies are provided
// @Module : annotates that this class will act as "hilt module"



@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideEngine(): Engine{
        return Engine()                                         // single instance of engine
    }


    fun provideCar(engine : Engine): Car{
        return Car(engine)
    }




}

/*

@Provides : tells hilt how to provide an object, methods annotated with 'provides' returns the object that will be injected.
            'provides' is used in module where you cant use inject on the constructor. eg. third party modules.

@Singleton : ensures that hilt creates a single instance of the dependency across the entire application. Singleton annotated object lives
             for the entire lifetime of the application and can be reused wherever ot is needed.

             Without singleton, a new instance of car would be created everytime it is requested


*/
