package com.adastra_one.ageofempires.model

data class Civilizations(
    val civilizations: List<Civilization>
)

data class Civilization(
    val army_type: String,
    val civilization_bonus: ArrayList<String>,
    val expansion: String,
    val id: Int,
    val name: String,
    val team_bonus: String,
    val unique_tech: List<String>,
    val unique_unit: List<String>
)