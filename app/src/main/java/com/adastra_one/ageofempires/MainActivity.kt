package com.adastra_one.ageofempires

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adastra_one.ageofempires.adapters.CivilizationAdapter
import com.adastra_one.ageofempires.databinding.ActivityMainBinding
import com.adastra_one.ageofempires.model.Civilization
import com.adastra_one.ageofempires.viewmodel.CivilizationViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var civilizationViewModel: CivilizationViewModel
        val itemsList =  ArrayList<Civilization>()
        lateinit var cvRecyclerView: RecyclerView
        lateinit var civilizationAdapter: CivilizationAdapter
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        cvRecyclerView = binding.cvRecyclerView
        civilizationViewModel = ViewModelProvider(this).get(CivilizationViewModel::class.java)

        civilizationViewModel.getCivilizations()!!.observe(this) { civilizations ->

            Log.d("RESP", civilizations.toString())

            itemsList.clear()

            for (item in civilizations.civilizations) {
                itemsList.add(item)

                val layoutManager = LinearLayoutManager(MainActivity@ this)
                cvRecyclerView.layoutManager = layoutManager
                civilizationAdapter = CivilizationAdapter(itemsList, this)
                cvRecyclerView.adapter = civilizationAdapter
                civilizationAdapter.notifyDataSetChanged()
            }


        }

        setContentView(binding.root)
    }
}