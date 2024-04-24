package com.example.marvelapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelapp.R
import com.example.marvelapp.model.Superheroe
import com.bumptech.glide.Glide

class HorizontalRecyclerViewAdapter(private val dataList: List<Superheroe>) : RecyclerView.Adapter<HorizontalRecyclerViewAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontal_superheroe, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val superheroe = dataList[position]
        holder.bind(superheroe, holder.itemView.context)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val superheroeName = view.findViewById<TextView>(R.id.tvSuperhero)
        private val realName = view.findViewById<TextView>(R.id.tvRealName)
        private val publiser = view.findViewById<TextView>(R.id.tvPublisher)
        private val foto = view.findViewById<ImageView>(R.id.ivAvatar)

        fun bind(superheroe: Superheroe, context: Context) {
            superheroeName.text = superheroe.nombre
            realName.text = superheroe.nombreReal
            publiser.text = superheroe.publisher
            foto.loadImage(superheroe.foto)
        }

        private fun ImageView.loadImage(url: String) {
            Glide.with(context).load(url).into(this)
        }
    }
}