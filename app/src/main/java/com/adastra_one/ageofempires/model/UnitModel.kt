package com.adastra_one.ageofempires.model

data class UnitModel(
    val age: String,
    val armor: String,
    val attack: Int,
    val attack_bonus: List<String>,
    val build_time: Int,
    val cost: Cost,
    val created_in: String,
    val description: String,
    val expansion: String,
    val hit_points: Int,
    val id: Int,
    val line_of_sight: Int,
    val movement_rate: Double,
    val name: String,
    val reload_time: Double
)

data class Cost(
    val Food: Int,
    val Gold: Int
)