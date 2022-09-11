package com.adastra_one.ageofempires.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adastra_one.ageofempires.view.MainActivity
import com.adastra_one.ageofempires.R
import com.adastra_one.ageofempires.databinding.CivilizationBonusItemBinding
import com.adastra_one.ageofempires.databinding.CivilizationListRowBinding
import com.adastra_one.ageofempires.model.Civilization
import com.adastra_one.ageofempires.view.ActivityDetail

class CivilizationBonusAdapter(
    var itemsList:ArrayList<String>,
    context: ActivityDetail
): RecyclerView.Adapter<CivilizationBonusAdapter.MyViewHolder>()
{
    var cont = context
    //var onClickListener = onClickListener
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = CivilizationBonusItemBinding.bind(view)


        var name = binding.name



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.civilization_bonus_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]


        /*
        holder.cardView.setOnClickListener { cont.itemClick()   /*onClickListener.onClick(holder.topView)*/ }
        holder.name.text = item.name
        holder.expansion.text = item.expansion
        holder.armyType.text = item.army_type
        holder.teamBonus.text = item.team_bonus

        holder.button1.setOnClickListener { cont.buttonOneClick() }
        holder.button2.setOnClickListener { cont.buttonTwoClick() }
        */

        holder.name.text = item

    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}