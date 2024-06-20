package com.example.myappkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val psnNik = intent.getStringExtra("nik")
        val psnNama = intent.getStringExtra("nama")
        val psnAlamat = intent.getStringExtra("alamat")
        val psnAgama = intent.getStringExtra("agama")
        val psnJkel = intent.getStringExtra("jkell")

        val txtNik = findViewById<TextView>(R.id.txtNIK).apply {
            text = psnNik
        }
        val txtNama = findViewById<TextView>(R.id.txtNama).apply {
            text = psnNama
        }
        val txtAlamat = findViewById<TextView>(R.id.txtAlamat).apply {
            text = psnAlamat
        }
        val txtAgama = findViewById<TextView>(R.id.txtAgama).apply {
            text = psnAgama
        }
        val txtJkel = findViewById<TextView>(R.id.txtJKel).apply {
            text = psnJkel
        }
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener(View.OnClickListener {
            finish()
        })


    }
}