package com.example.praktisi2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btnLog: Button

    lateinit var edUser: EditText
    var user = ""
    lateinit var edPass: EditText
    var pass = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLog = findViewById(R.id.btnLog)
        edUser = findViewById(R.id.edUser)
        edPass = findViewById(R.id.edPass)

        btnLog.setOnClickListener {
            user = edUser.text.toString()
            pass = edPass.text.toString()

            if (user == "admin" && pass == "123") {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                val intentData = Intent(this@MainActivity, home::class.java)
                intentData.putExtra(home.extraUser, user)
                intentData.putExtra(home.extraPass, pass)
                startActivity(intentData)
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}