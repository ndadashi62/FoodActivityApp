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

        radioWilensky.setOnClickListener {

        }

        btnOrder.setOnClickListener {
            order()
        }

    }

    fun order() {


        if (radioWilensky.isChecked == true) {


            val intent = Intent(this@MainActivity, OrderActivity::class.java)
            startActivity(intent)


        }


    }


}

















