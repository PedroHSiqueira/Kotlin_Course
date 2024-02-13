package com.example.mvvmarchitecture

class PersonRepository {
    fun login(email: String, password: String): Boolean{
        return (email != "" && password != "")
    }
}