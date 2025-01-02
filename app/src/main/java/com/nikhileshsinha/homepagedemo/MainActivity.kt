package com.nikhileshsinha.homepagedemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView1: RecyclerView
    private lateinit var headingList: ArrayList<HomeDataClasss>
    lateinit var headings: Array<String>
    private lateinit var headingList2: ArrayList<HomeDataClasss2>
    lateinit var headings201: Array<String>
    lateinit var headings202: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            headings = arrayOf("Exeltis Tutor Objeciones", "Roleplay Case Tutor")
            recyclerView = findViewById(R.id.rv)
            recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
            recyclerView.setHasFixedSize(true)
            headingList = arrayListOf<HomeDataClasss>()
            getData()

            headings201  = arrayOf("Exeltis Tutor Objeciones", "Sanfer Rolplay Doctor", "Problem Solver Tutor", "Rolplay Mexico")
            headings202  = arrayOf("Rolplay Case Tutor", "Tutor Novo Nordisk", "Tutor Magisterial Merida", "Rolplay Revolucion de Mayo")
            recyclerView1 = findViewById(R.id.rv2)
            recyclerView1.layoutManager = LinearLayoutManager(this)
            recyclerView1.setHasFixedSize(true)
            headingList2 = arrayListOf<HomeDataClasss2>()
            getData2()
            insets
        }
    }

    private fun getData(){
        for (i in headings.indices){
            val head = HomeDataClasss(headings[i])
            headingList.add(head)
        }
        recyclerView.adapter = HomeAdapter(headingList)
    }

    private fun getData2(){
        for (i in headings201.indices){
            val head1 = HomeDataClasss2(headings201[i], headings202[i])
            headingList2.add(head1)
        }
        recyclerView1.adapter = HomeAdapter2(headingList2)
    }
}