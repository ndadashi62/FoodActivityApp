package com.example.foodactivityapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_order.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







        btnOrder.setOnClickListener {
            order()
        }

    }

    fun order() {


        if (radioWilensky.isChecked == true) {
            val intent = Intent(this@MainActivity, OrderActivity::class.java)

            var tvDisplaCostumerName: String = editTextCostumerName.text.toString()

            var wilensky: String = radioWilensky.text.toString()

          //  var poutine: String = radioWilensky.text.toString()
            //var pizza: String = radioWilensky.text.toString()
           // var burger: String = radioWilensky.text.toString()
           // var greenSalad: String = radioWilensky.text.toString()
           // var bagales: String = radioWilensky.text.toString()
            
            intent.putExtra("costumername", tvDisplaCostumerName)

            intent.putExtra("wilsky", wilensky)
           // intent.putExtra("poutine", poutine)
            //intent.putExtra("pizza", pizza)
           // intent.putExtra("burger", burger)
           // intent.putExtra("greenSalad", greenSalad)
           // intent.putExtra("bageles", bagales)

            startActivity(intent)


        }


    }


}

















