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
import com.adastra_one.ageofempires.databinding.ActivityMainBinding
import com.adastra_one.ageofempires.interfaces.ItemClickListener
import com.adastra_one.ageofempires.interfaces.UniqueTechClickListener
import com.adastra_one.ageofempires.interfaces.UniqueUniteClickListener
import com.adastra_one.ageofempires.model.Civilization
import com.adastra_one.ageofempires.viewmodel.CivilizationViewModel

class MainActivity : AppCompatActivity(), ItemClickListener, UniqueUniteClickListener, UniqueTechClickListener {
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

    override fun itemClick() {
        Toast.makeText(this, "Item Clicked", Toast.LENGTH_LONG).show()
    }

    override fun buttonOneClick() {
        Toast.makeText(this, "Unique Unite Button Click", Toast.LENGTH_LONG).show()
        val intent = Intent(this, ActivityDetailUnit::class.java)
        startActivity(intent)
    }

    override fun buttonTwoClick() {
        Toast.makeText(this, "Unique Tech Button Click", Toast.LENGTH_LONG).show()
    }


}