package com.example.myappkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val edtNik = findViewById<EditText>(R.id.edtNIK)
        val edtNama = findViewById<EditText>(R.id.edtNama)
        val edtAlamat = findViewById<EditText>(R.id.edtAlamat)
        val edtAgama = findViewById<EditText>(R.id.edtAgama)
        val btnOK = findViewById<Button>(R.id.btnOK)
        val rbLaki = findViewById<RadioButton>(R.id.rbLaki)
        val rbPerempuan = findViewById<RadioButton>(R.id.rbPerempuan)
        val txtGnd = findViewById<TextView>(R.id.txtGnd)

        /*btnOK.setOnClickListener(View.OnClickListener {

            val nik = edtNik.text.toString()
            val nama = edtNama.text.toString()
            //val alamat = edtAlamat.text.toString()
            //val agama = edtAgama.text.toString()

            Toast.makeText(this,"NIK anda :"+nik+", Nama anda : "+nama+", Alamat : "+alamat+", Agama : "+agama,Toast.LENGTH_LONG).show()
        })*/
        btnOK.setOnClickListener(View.OnClickListener {
            val nik = edtNik.text.toString()
            val nama = edtNama.text.toString()
            val alamat = edtAlamat.text.toString()
            val agama = edtAgama.text.toString()

            if(rbLaki.isChecked){
                    val jkel = "Laki-Laki"
                    txtGnd.text = jkel
            }else if(rbPerempuan.isChecked){
                    val jkel = "Perempuan"
                    txtGnd.text = jkel
            }
            val jkell = txtGnd.text
            //Toast.makeText(this,"NIM anda : "+nim+", Nama anda : "+nama,Toast.LENGTH_LONG).show()
            val intent = Intent(this,MainActivity2::class.java).also {
                it.putExtra("nik",nik)
                it.putExtra("nama",nama)
                it.putExtra("alamat",alamat)
                it.putExtra("agama",agama)
                it.putExtra("jkel",jkell)
                startActivity(it)
            }

        })

    }
}