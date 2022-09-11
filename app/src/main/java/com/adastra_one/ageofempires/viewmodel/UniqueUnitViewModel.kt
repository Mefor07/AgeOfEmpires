package com.adastra_one.ageofempires.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adastra_one.ageofempires.model.Civilizations
import com.adastra_one.ageofempires.model.UnitModel
import com.adastra_one.ageofempires.repository.CivilizationRepository
import com.adastra_one.ageofempires.repository.UniquUnitRepository

class UniqueUnitViewModel: ViewModel() {

    var uniqueUniteLiveData: MutableLiveData<UnitModel>? =  null

    fun getUniqueUnite(): LiveData<UnitModel>? {
        uniqueUniteLiveData = UniquUnitRepository.getUniqueUnitApiCall()
        return uniqueUniteLiveData
    }
}