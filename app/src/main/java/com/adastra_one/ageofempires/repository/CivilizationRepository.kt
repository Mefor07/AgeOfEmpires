package com.adastra_one.ageofempires.repository

import androidx.lifecycle.MutableLiveData
import app.medrx.MedrxApp.retrofit.RetrofitClient
import com.adastra_one.ageofempires.model.Civilizations
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object CivilizationRepository {
    val civilization = MutableLiveData<Civilizations>()


    fun getCivilizationDataApiCall(): MutableLiveData<Civilizations>{
        val call = RetrofitClient.apiInterface.civilizations()
        call.enqueue(object : Callback<Civilizations> {
            override fun onResponse(call: Call<Civilizations>, response: Response<Civilizations>) {
                val data = response.body()
                val civilzations = data!!.civilizations
                civilization.value = Civilizations(civilzations)
            }

            override fun onFailure(call: Call<Civilizations>, t: Throwable) {

            }

        })
        return  civilization
    }

}