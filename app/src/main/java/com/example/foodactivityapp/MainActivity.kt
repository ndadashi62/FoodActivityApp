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

        val intent = Intent(this@MainActivity, OrderActivity::class.java)
        var tvDisplaCostumerName: String = editTextCostumerName.text.toString()
        if (tvDisplaCostumerName.isNullOrEmpty()) {
            Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show()
            return
        }
        intent.putExtra("costumername", tvDisplaCostumerName)



        if (radioWilensky.isChecked == true) {

            var wilensky: String = radioWilensky.text.toString()
            intent.putExtra("wilsky", wilensky)
            startActivity(intent)
        }
         else if  (radioPutine.isChecked == true) {

            var poutine: String = radioPutine.text.toString()
            intent.putExtra("poutine", poutine)
            startActivity(intent)}

        else if (radioPizza.isChecked == true) {

            var pizza: String = radioPizza.text.toString()
            intent.putExtra("pizza", pizza)
            startActivity(intent)

        } else if (radioBurger.isChecked == true) {

            var burger: String = radioBurger.text.toString()
            intent.putExtra("burger", burger)
            startActivity(intent)}

        else  if (radioGreenSalad.isChecked == true) {

            var greenSalad: String = radioGreenSalad.text.toString()
          intent.putExtra("greenSalad", greenSalad)
           startActivity(intent)
      }

        else  if (radioBagles.isChecked == true) {

            var bagles: String = radioBagles.text.toString()
            intent.putExtra("bagles", bagles)
            startActivity(intent)
        }

       else( Toast.makeText(this, "you didnt select your food ", Toast.LENGTH_SHORT).show())

//        btnFinish.setOnClickListener {
//
//            finish();
//            System.exit(0);
//        }

    }



}












