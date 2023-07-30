package com.example.superherorecycle

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // dataları hazırladığımız yer
        // eklediğimiz sıra görsel nesneler için önemli eğer sıra kayarsa yanlıs görsel çekebiliriz

        var superHeroName = ArrayList<String>()

        superHeroName.add("Aquaman")
        superHeroName.add("Batman")
        superHeroName.add("Superman")
        superHeroName.add("Hulk")
        superHeroName.add("IronMan")

        // görselleri nesneleştirmek için bitmap kullanırız ama burda kullanırsak verimsiz olur
        // yine de bu kullanımı görmek gerekirse diye yorumlar ile kapattım

        /*val aqumanBitmap   = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquman)
        val batmanBitmap   = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap  = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val hulkBitmap     = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.hulk)

        val superHeroImages = ArrayList<Bitmap>()
        superHeroImages.add(aqumanBitmap)
        superHeroImages.add(batmanBitmap)
        superHeroImages.add(supermanBitmap)
        superHeroImages.add(hulkBitmap)
        superHeroImages.add(ironmanBitmap)*/

        // verimli tanımlama bu sekilde yapılır
        val aquamanDrawableId  = R.drawable.aquman
        val batmanDrawableId   = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val ironmanDrawableId  = R.drawable.ironman
        val hulkDrawableId     = R.drawable.hulk

        var superHeroDrawableList = ArrayList<Int>()
        superHeroDrawableList.add(aquamanDrawableId)
        superHeroDrawableList.add(batmanDrawableId)
        superHeroDrawableList.add(supermanDrawableId)
        superHeroDrawableList.add(hulkDrawableId)
        superHeroDrawableList.add(ironmanDrawableId)


        //ADAPTER
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superHeroName,superHeroDrawableList)
        recyclerView.adapter = adapter






    }
}