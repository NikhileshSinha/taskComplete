package com.nikhileshsinha.homepagedemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter2(private val headingList2: ArrayList<HomeDataClasss2>): RecyclerView.Adapter<HomeAdapter2.ViewHolderClass>() {


    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val heading1: TextView = itemView.findViewById(R.id.heading_string1)
        val heading2: TextView = itemView.findViewById(R.id.heading_string2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.vertical_recycler_view, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return headingList2.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentHeading = headingList2[position]
        holder.heading1.setText(currentHeading.heading1)
        holder.heading2.setText(currentHeading.heading2)
    }
}