package com.adastra_one.ageofempires.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adastra_one.ageofempires.adapters.CivilizationAdapter
import com.adastra_one.ageofempires.adapters.CivilizationBonusAdapter
import com.adastra_one.ageofempires.databinding.ActivityDetailBinding


class ActivityDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var itemsList =  ArrayList<String>()
        lateinit var cvBonusRecyclerView: RecyclerView
        lateinit var civilizationBonusAdapter: CivilizationBonusAdapter
        super.onCreate(savedInstanceState)

        val binding = ActivityDetailBinding.inflate(layoutInflater)
        cvBonusRecyclerView = binding.cvBonusRecyclerview

        binding.name.text = intent.getStringExtra("NAME_EXTRA");
        binding.expansion.text = intent.getStringExtra("EXPANSION_EXTRA")
        binding.armyType.text = intent.getStringExtra("ARMY_TYPE_EXTRA")
        binding.teamBonus.text = intent.getStringExtra("TEAM_BONUS_EXTRA")

        itemsList = intent.getStringArrayListExtra("BONUS_ARRAY") as ArrayList<String>
        val layoutManager = LinearLayoutManager(ActivityDetail@this)
        cvBonusRecyclerView.layoutManager = layoutManager
        civilizationBonusAdapter = CivilizationBonusAdapter(itemsList, this)
        cvBonusRecyclerView.adapter = civilizationBonusAdapter
        civilizationBonusAdapter.notifyDataSetChanged()

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