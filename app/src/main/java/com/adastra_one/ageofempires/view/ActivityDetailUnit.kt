package com.adastra_one.ageofempires.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adastra_one.ageofempires.adapters.CivilizationAdapter
import com.adastra_one.ageofempires.databinding.ActivityDetailUnitBinding
import com.adastra_one.ageofempires.databinding.ActivityMainBinding
import com.adastra_one.ageofempires.interfaces.ItemClickListener
import com.adastra_one.ageofempires.interfaces.UniqueTechClickListener
import com.adastra_one.ageofempires.interfaces.UniqueUniteClickListener
import com.adastra_one.ageofempires.model.Civilization
import com.adastra_one.ageofempires.viewmodel.CivilizationViewModel
import com.adastra_one.ageofempires.viewmodel.UniqueUnitViewModel

class ActivityDetailUnit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var uniqueUnitViewModel: UniqueUnitViewModel
        val itemsList =  ArrayList<Civilization>()


        super.onCreate(savedInstanceState)
        val binding = ActivityDetailUnitBinding.inflate(layoutInflater)

        val name = binding.name
        val description = binding.description
        val expansion = binding.expansion
        val age = binding.age

        uniqueUnitViewModel = ViewModelProvider(this).get(UniqueUnitViewModel::class.java)

        uniqueUnitViewModel.getUniqueUnite()!!.observe(this) { uniqueunite ->

            //Log.d("RESP", civilizations.toString())

            itemsList.clear()


            name.text = uniqueunite.name
            description.text = uniqueunite.description
            expansion.text = uniqueunite.expansion
            age.text = uniqueunite.age


        }

        //actionbar
        val actionbar = supportActionBar

        actionbar!!.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()

        return  true
    }


}