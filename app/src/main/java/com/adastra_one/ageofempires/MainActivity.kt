package com.adastra_one.ageofempires

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.adastra_one.ageofempires.adapters.CivilizationAdapter
import com.adastra_one.ageofempires.databinding.ActivityMainBinding
import com.adastra_one.ageofempires.model.Civilization
import com.adastra_one.ageofempires.viewmodel.CivilizationViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var civilizationViewModel: CivilizationViewModel
        val itemsList =  ArrayList<Civilization>()
        lateinit var civilizationAdapter: CivilizationAdapter
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        civilizationViewModel = ViewModelProvider(this).get(CivilizationViewModel::class.java)

        civilizationViewModel.getCivilizations()!!.observe(this, { civilizations ->

            Log.d("RESP", civilizations.toString())
            
            itemsList.clear()

            for (item in civilizations.civilizations){

            }


            /*
            val success = orders.success
            if (success) {
                itemsList.clear()
                for (item in orders.orders) {
                    itemsList.add(item.order)
                }
                val layoutManager = LinearLayoutManager(context)
                recyclerView.layoutManager = layoutManager
                ordersAdapter = OrdersAdapter(itemsList, this)
                recyclerView.adapter = ordersAdapter
                ordersAdapter.notifyDataSetChanged()
            }
            */

        })

        setContentView(binding.root)
    }
}