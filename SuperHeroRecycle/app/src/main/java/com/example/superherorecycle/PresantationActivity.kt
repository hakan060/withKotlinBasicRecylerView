package com.example.superherorecycle

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_presantation.*

class PresantationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presantation)

        val intent              = intent
        val chooseSuperHeroName = intent.getStringExtra("superHeroName")
        textView.text           = chooseSuperHeroName

        val chosenSuperHeroImages = intent.getIntExtra("SuperHeroImages",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,chosenSuperHeroImages)
        imageView.setImageBitmap(bitmap)

        /*val chosenSuperHero = SingletonClass.ChoosenSuperHero
        val chosenImages = chosenSuperHero.images
        imageView.setImageBitmap(chosenImages)*/

    }
}