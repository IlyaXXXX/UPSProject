package com.example.upsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var editText: EditText

     val promo1 = "1"
     val promo2 = "2"
     val promo3 = "3"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn_promo)
        editText = findViewById(R.id.enter_promo)


        btn.setOnClickListener(){
            val tempVar = editText.getText().toString()
            when(tempVar){
                promo1 ->  Toast.makeText(this,"Промокод принят", Toast.LENGTH_SHORT).show()
                promo2 ->  Toast.makeText(this,"Промокод принят", Toast.LENGTH_SHORT).show()
                promo3 ->  Toast.makeText(this,"Промокод принят", Toast.LENGTH_SHORT).show()
                else ->  Toast.makeText(this,"Промокод не найден", Toast.LENGTH_SHORT).show()
            }
        }
    }
}