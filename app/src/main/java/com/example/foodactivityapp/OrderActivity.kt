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



        textViewCustomerName.setText(intent.getStringExtra("costumername"))

        if(!intent.getStringExtra("key").isNullOrEmpty()){
            textViewDisplayOrderName.text =intent.getStringExtra("key")
        }


//        textViewDisplayOrderName.setText(intent.getStringExtra("pizza"))
//
//        textViewDisplayOrderName.setText(intent.getStringExtra("burger"))
//
//         textViewDisplayOrderName.setText(intent.getStringExtra("greenSalad"))
//
//        textViewDisplayOrderName.setText(intent.getStringExtra("bagles"))
//



        btnGoBack.setOnClickListener {
           finish()
        }

    }

    override fun onBackPressed() {

    }
}