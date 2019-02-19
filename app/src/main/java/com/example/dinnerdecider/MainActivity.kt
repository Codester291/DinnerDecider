package com.example.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist = arrayListOf("Chinese","Beans","Rice","Asaro","Pizza","Amala")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{

            val rand = Random();
            val randomFood = rand.nextInt(foodlist.count())

            food.text = foodlist[randomFood]
        }

        addFoodBtn.setOnClickListener{

            
                val newfood = addFoodText.text.toString()
                foodlist.add(newfood)
                addFoodText.text.clear()



            println(foodlist)
        }

    }


}

