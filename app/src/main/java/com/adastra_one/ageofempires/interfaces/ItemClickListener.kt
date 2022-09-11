package com.adastra_one.ageofempires.interfaces

interface ItemClickListener {
    fun itemClick(name: String, expansion: String, armyType: String, teamBonus: String, cvBonus: ArrayList<String>)
}