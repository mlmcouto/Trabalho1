package com.example.trabaho01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Maintext2 = findViewById<TextView>(R.id.activity3_text1)
        Maintext2.text = intent.getStringExtra("mytext")

        val Maintext3 = findViewById<TextView>(R.id.activity3_text2)
        Maintext3.text = intent.getStringExtra("mytext")

        val button3 = findViewById<Button>(R.id.btn_3)
        button3.setOnClickListener{
            val text2 = Maintext2.text.toString()
            val text3 = Maintext3.text.toString()
            val intent01 = Intent()
            val intent02 = Intent()
            intent01.putExtra("my_name", text2)
            intent02.putExtra("my_name", text3)
            setResult(201, intent01)
            setResult(201, intent02)
            finish()
        }

        val button4 = findViewById<Button>(R.id.btn_4)
        button4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivityForResult(intent, MainActivity.REQUEST_CODE)
        }


    }
}


