package com.example.hitungkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtBil1 = findViewById<EditText>(R.id.edtBil1)
        val edtBil2 = findViewById<EditText>(R.id.edtBil2)
        val btnHitung = findViewById<Button>(R.id.button)
        val txtHasil = findViewById<TextView>(R.id.txtHasil)

        btnHitung.setOnClickListener(View.OnClickListener {
            val bil1 = edtBil1.text.toString().toDouble()
            val bil2 = edtBil2.text.toString().toDouble()

            val ubahBil2 = bil2 / 100
            val hasil = bil1 / (ubahBil2*ubahBil2)

            txtHasil.text = hasil.toString()
            /*if (hasil < 18.5){
                txtHasil.text = hasil.toString()+" , selamat kategori anda adalah underweight"
            }else if (hasil >=18.5 && hasil <=24.9){
                txtHasil.text = hasil.toString()+ " , selamat kategori anda adalah normal"
            }else if (hasil >= 25 && hasil <=29.9){
                txtHasil.text = hasil.toString()+ " , selamat kategori anda adalah overweight"
            }else{
                txtHasil.text = hasil.toString()+ " , selamat kategori anda adalah obesitas"
            }*/

        })
    }
}