package com.example.clase17modulo4


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var tv_vista: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val paises = arrayOf( "Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay")
        val habitantes = arrayOf(40_000_000, 17_000_000, 6_500_000, 10_000_000, 30_000_000, 14_000_000, 183_000_000, 44_000_000, 31_000_000, 3_500_000)
        listView = findViewById(R.id.listview)
        tv_vista = findViewById(R.id.tv_vista)
        val adaptador1 = ArrayAdapter(this,android.R.layout.simple_list_item_1,paises)
        listView.adapter = adaptador1

        listView.setOnItemClickListener { adapterView, view, i, l ->
            tv_vista.text = "Poblacion de : ${habitantes[i]}"
        }

    }
}