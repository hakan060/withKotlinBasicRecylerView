package com.example.superherorecycle

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val superHeroList : ArrayList<String>, val superHeroImagesList : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperHeroViewHolder>() {

    class SuperHeroViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent , false) // baglı diye soryor fals döner
        return SuperHeroViewHolder(itemView)
        //recycler rowu bagladıgımız kısım
    }

    override fun getItemCount(): Int {
        // içerisinde kaç row olacak onu belirtir
        return superHeroList.size
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.itemView.recyclerViewTextView.text = superHeroList.get(position) // bastan sonra kadar ceker indekse uyumlu çalısır
        holder.itemView.setOnClickListener{

            val intent = Intent(holder.itemView.context,PresantationActivity::class.java)
            intent.putExtra("superHeroName",superHeroList.get(position))
            intent.putExtra("SuperHeroImages",superHeroImagesList.get(position))

            /*val singleton = SingletonClass.ChoosenSuperHero
            singleton.images = superHeroImagesList.get(position)*/
            holder.itemView.context.startActivity(intent)


        }


    }


}