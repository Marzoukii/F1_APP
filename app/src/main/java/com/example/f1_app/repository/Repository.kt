package com.example.f1_app.repository

import com.example.f1_app.fakeDatabase

class Repository {

    private val database= fakeDatabase()

    fun getCurrentPilotes() = database.getListPilotes()

}