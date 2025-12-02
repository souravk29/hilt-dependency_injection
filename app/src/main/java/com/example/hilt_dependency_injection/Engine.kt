package com.example.hilt_dependency_injection

import javax.inject.Inject

// dependency/dependecy class

class Engine @Inject constructor() {

    fun start() = "Engine Start"

}