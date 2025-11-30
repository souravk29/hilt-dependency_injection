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





}

/*

@Provides : tells hilt how to provide an object, methods annotated with 'provides' returns the object that will be injected
            'provides' is used in module where you cant use inject on the constructor. eg. third party modules

@Singleton : ensures that hilt provides the single instance of the dependency across the entire application. its annotated object lives
             for the entire lifetime of the application and can be reused.


*/
