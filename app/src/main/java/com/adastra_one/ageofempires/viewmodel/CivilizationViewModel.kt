package com.adastra_one.ageofempires.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adastra_one.ageofempires.model.Civilizations
import com.adastra_one.ageofempires.repository.CivilizationRepository

class CivilizationViewModel: ViewModel() {

    var civilizationLiveData: MutableLiveData<Civilizations>? =  null

    fun getCivilizations(): LiveData<Civilizations>? {
        civilizationLiveData = CivilizationRepository.getCivilizationDataApiCall()
        return civilizationLiveData
    }
}