package com.example.foodactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_order.*


class OrderActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)




        var displaycustumername = intent.getStringExtra("costumername")
        var tvdisplaycostumername = textViewCustomerName.setText(displaycustumername)

        var wilsky = intent.getStringExtra("wilsky")
        var tvWilsky = textViewDisplayOrderName.setText(wilsky)

       var poutine = intent.getStringExtra("poutine")
        var tvpoutine = textViewDisplayOrderName.setText(poutine)

       var pizza = intent.getStringExtra("pizza")
        var tvpizza = textViewDisplayOrderName.setText(pizza)

       var burger = intent.getStringExtra("burger")
       var tvBurger = textViewDisplayOrderName.setText(burger)

        var greenSalad = intent.getStringExtra("greenSalad")
       var tvGreenSalad = textViewDisplayOrderName.setText(greenSalad)

        var bagles = intent.getStringExtra("bagles")
        var tvbagles = textViewDisplayOrderName.setText(bagles)

        btnGoBack.setOnClickListener {
            val intent = Intent(this@OrderActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}