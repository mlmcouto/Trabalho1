package com.example.trabaho01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val mainText1 = findViewById<TextView>(R.id.activity5_text1)
        mainText1.text = intent.getStringExtra("mytext")

        val mainText2 = findViewById<TextView>(R.id.activity5_text2)
        mainText2.text = intent.getStringExtra("mytext")

        val button5 = findViewById<Button>(R.id.btn_5)
        button5.setOnClickListener{
            val text1 = mainText1.text.toString()
            val text2 = mainText2.text.toString()
            val intent1 = Intent()
            val intent2 = Intent()
            intent1.putExtra("my_name", text1)
            intent2.putExtra("my_name", text2)
            setResult(201, intent1)
            setResult(201, intent2)
            finish()
        }

        val button6 = findViewById<Button>(R.id.btn_6)
        button6.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivityForResult(intent, MainActivity.REQUEST_CODE)
        }

    }


}
