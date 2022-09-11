package com.adastra_one.ageofempires.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adastra_one.ageofempires.view.MainActivity
import com.adastra_one.ageofempires.R
import com.adastra_one.ageofempires.databinding.CivilizationListRowBinding
import com.adastra_one.ageofempires.model.Civilization
import com.adastra_one.ageofempires.view.ActivityDetail

class CivilizationBonusAdapter(
    var itemsList:List<String>,
    context: ActivityDetail
): RecyclerView.Adapter<CivilizationBonusAdapter.MyViewHolder>()
{
    var cont = context
    //var onClickListener = onClickListener
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = CivilizationListRowBinding.bind(view)

        var cardView = binding.cardView
        var name = binding.name
        var expansion = binding.expansion
        var armyType = binding.armyType
        var teamBonus = binding.teamBonus
        var button1 = binding.button1
        var button2 = binding.button2


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.civilization_list_row, parent, false)
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

    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}