package com.example.a006passingdata

import java.io.Serializable

data class Person (
    val name:String,
    val age:Int,
    val country:String
) : Serializable