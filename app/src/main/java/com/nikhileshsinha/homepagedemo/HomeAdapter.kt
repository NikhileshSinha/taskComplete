package com.nikhileshsinha.homepagedemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter(private val headingList: ArrayList<HomeDataClasss>): RecyclerView.Adapter<HomeAdapter.ViewHolderClass>() {


    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val heading: TextView = itemView.findViewById(R.id.heading_string1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_recycle_view, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return headingList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentHeading = headingList[position]
        holder.heading.setText(currentHeading.heading)

    }
}