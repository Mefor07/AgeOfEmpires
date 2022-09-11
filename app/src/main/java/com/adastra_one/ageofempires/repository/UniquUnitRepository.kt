package com.adastra_one.ageofempires.repository

import androidx.lifecycle.MutableLiveData
import app.medrx.MedrxApp.retrofit.RetrofitClient
import com.adastra_one.ageofempires.model.Civilizations
import com.adastra_one.ageofempires.model.UnitModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object UniquUnitRepository {
    val uniqueUnit = MutableLiveData<UnitModel>()


    fun getUniqueUnitApiCall(): MutableLiveData<UnitModel>{
        val call = RetrofitClient.apiInterface.uniqueUnit()
        call.enqueue(object : Callback<UnitModel> {
            override fun onResponse(call: Call<UnitModel>, response: Response<UnitModel>) {
                val data = response.body()

                uniqueUnit.value = UnitModel(data!!.age, data.armor, data.attack, data.attack_bonus,
                    data.build_time, data.cost, data.created_in, data.description, data.expansion,
                data.hit_points, data.id, data.line_of_sight, data.movement_rate, data.name,
                    data.reload_time)
            }

            override fun onFailure(call: Call<UnitModel>, t: Throwable) {

            }

        })
        return  uniqueUnit
    }

}