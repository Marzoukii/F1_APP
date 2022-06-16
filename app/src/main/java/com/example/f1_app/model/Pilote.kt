package com.example.f1_app.model

import java.io.Serializable
data class Pilote (
    val id: Int,
    val photo: Int,
    val nomPilote: String,
    val description: String
): Serializable