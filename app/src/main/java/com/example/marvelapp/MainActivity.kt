package com.example.marvelapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.net.toUri
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelapp.adapter.HorizontalRecyclerViewAdapter
import com.bumptech.glide.Glide
import com.example.marvelapp.adapter.RecyclerViewAdapter
import com.example.marvelapp.data.DataSource
import com.example.marvelapp.databinding.ActivityMainBinding
import com.example.marvelapp.model.Superheroe

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var miRecyler: RecyclerView
    lateinit var horizontalRecyclerView: RecyclerView
    lateinit var miAdapter: RecyclerViewAdapter
    lateinit var horizontalAdapter: HorizontalRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el RecyclerView vertical
        miRecyler = binding.rvsuperheroes
        miRecyler.setHasFixedSize(true)
        miRecyler.layoutManager = LinearLayoutManager(this)
        miAdapter = RecyclerViewAdapter() // Inicializamos miAdapter
        miAdapter.RecyclerViewAdapter(DataSource().getSuperHeroes(), this)
        miRecyler.adapter = miAdapter

        // Configurar el RecyclerView horizontal
        horizontalRecyclerView = binding.horizontalRecyclerView
        horizontalRecyclerView.setHasFixedSize(true)
        horizontalRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        horizontalAdapter = HorizontalRecyclerViewAdapter(DataSource().getSuperHeroes()) // Inicializamos horizontalAdapter y pasamos la lista de Superhéroes
        horizontalRecyclerView.adapter = horizontalAdapter
    }
}