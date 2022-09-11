package com.adastra_one.ageofempires.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adastra_one.ageofempires.adapters.CivilizationAdapter
import com.adastra_one.ageofempires.databinding.ActivityDetailBinding
import com.adastra_one.ageofempires.databinding.ActivityMainBinding
import com.adastra_one.ageofempires.interfaces.ItemClickListener
import com.adastra_one.ageofempires.interfaces.UniqueTechClickListener
import com.adastra_one.ageofempires.interfaces.UniqueUniteClickListener
import com.adastra_one.ageofempires.model.Civilization
import com.adastra_one.ageofempires.viewmodel.CivilizationViewModel

class ActivityDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val itemsList =  ArrayList<String>()
        lateinit var cvBonusRecyclerView: RecyclerView
        lateinit var civilizationAdapter: CivilizationAdapter
        super.onCreate(savedInstanceState)

        val binding = ActivityDetailBinding.inflate(layoutInflater)

        binding.name.text = intent.getStringExtra("NAME_EXTRA");
        binding.expansion.text = intent.getStringExtra("EXPANSION_EXTRA")
        binding.armyType.text = intent.getStringExtra("ARMY_TYPE_EXTRA")
        binding.teamBonus.text = intent.getStringExtra("TEAM_BONUS_EXTRA")

            itemsList.clear()
            /*
            for (item in civilizations.civilizations) {
                itemsList.add(item)

                val layoutManager = LinearLayoutManager(MainActivity@ this)
                cvRecyclerView.layoutManager = layoutManager
                civilizationAdapter = CivilizationAdapter(itemsList, this)
                cvRecyclerView.adapter = civilizationAdapter
                civilizationAdapter.notifyDataSetChanged()

            }
            */


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