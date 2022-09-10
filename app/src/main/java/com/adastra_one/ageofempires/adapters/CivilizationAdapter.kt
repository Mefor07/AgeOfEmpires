package com.adastra_one.ageofempires.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adastra_one.ageofempires.MainActivity
import com.adastra_one.ageofempires.R
import com.adastra_one.ageofempires.databinding.CivilizationListRowBinding
import com.adastra_one.ageofempires.model.Civilization

class CivilizationAdapter(
    var itemsList:List<Civilization>,
    context: MainActivity
): RecyclerView.Adapter<CivilizationAdapter.MyViewHolder>()
{
    var cont = context
    //var onClickListener = onClickListener
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = CivilizationListRowBinding.bind(view)

        /*
        var orderTitle = binding.orderTitle
        var orderDate = binding.orderDate
        var orderCode = binding.orderCode
        var topView = binding.topView

         */
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.civilization_list_row, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]

        /*
        holder.topView.setOnClickListener { cont.orderClick(holder.topView, "${item.id}")   /*onClickListener.onClick(holder.topView)*/ }
        holder.orderCode.text = item.status
        holder.orderTitle.text = "Order #${item.id}"
        holder.orderDate.text = item.created_at
        */
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}