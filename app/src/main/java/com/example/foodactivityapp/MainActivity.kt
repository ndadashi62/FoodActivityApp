package com.example.foodactivityapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_order.*


class MainActivity : AppCompatActivity() {
    lateinit var submitOrderActivityIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitOrderActivityIntent = Intent(this@MainActivity, OrderActivity::class.java)


        btnOrder.setOnClickListener {
            order()
        }

        radioGroup.setOnCheckedChangeListener { group, checkedId ->


            when (checkedId) {
                R.id.radioWilensky ->
                    submitOrderActivityIntent.putExtra("key", radioWilensky.text.toString())
                R.id.radioPutine ->
                    submitOrderActivityIntent.putExtra("key", radioPutine.text.toString())
                R.id.radioPizza ->
                    submitOrderActivityIntent.putExtra("key", radioPizza.text.toString())
                R.id.radioGreenSalad ->
                    submitOrderActivityIntent.putExtra("key", radioBurger.text.toString())
                R.id.radioBagles ->
                    submitOrderActivityIntent.putExtra("key", radioBagles.text.toString())
            }

        }

    }

    fun order() {


        var tvDisplaCostumerName: String = editTextCostumerName.text.toString()
        if (tvDisplaCostumerName.isNullOrEmpty()) {
            Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show()
            return
        }
        submitOrderActivityIntent.putExtra("costumername", tvDisplaCostumerName)
        startActivity(submitOrderActivityIntent)


    }
//
//        } else (Toast.makeText(this, "you didnt select your food ", Toast.LENGTH_SHORT).show())

//        btnFinish.setOnClickListener {
//
//            finish();
//            System.exit(0);
//
}












