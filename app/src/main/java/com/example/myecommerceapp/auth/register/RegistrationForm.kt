package com.example.myecommerceapp.auth.register

data class RegistrationForm(
    val email : String = "",
    val emailError : String ?= null,
    val password : String = "",
    val passwordError : String ?= null
)
