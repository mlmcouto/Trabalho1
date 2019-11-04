package com.example.trabaho01

import android.Manifest
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.content.pm.PackageManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import android.net.Uri



class MainActivity : AppCompatActivity() {

    companion object {
        const val REQUEST_CODE = 102
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.btn_1)
        button1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, REQUEST_CODE)
            }

        val button2 = findViewById<Button>(R.id.btn_2)
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivityForResult(intent, REQUEST_CODE)
            }



        }

}





