package com.example.praktisi2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class home : AppCompatActivity() {

    private lateinit var  recyclerView: RecyclerView
    private lateinit var datalist: ArrayList<dataClass>
    lateinit var imageList:Array<Int>
    lateinit var title1List:Array<String>
    lateinit var title2List:Array<String>

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = dataClass(imageList[i], title1List[i], title2List[i])
            datalist.add(dataClass)
        }

        recyclerView.adapter = adapterClass(datalist)
    }

    companion object {
        const val extraUser = "extra_user"
        const val extraPass = "extra_pass"
    }

    lateinit var tvData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tvData = findViewById(R.id.tvData)

        val user = intent.getStringExtra(extraUser)
        val pass = intent.getStringExtra(extraPass)

        val text = "Selamat datang $user 😃 \n jangan lupa password anda adalah $pass"

        tvData.text = text

        imageList = arrayOf(
            R.drawable.univ_1,
            R.drawable.univ_2,
            R.drawable.univ_3,
            R.drawable.univ_4,
            R.drawable.univ_5,
            R.drawable.univ_6,
            R.drawable.univ_7,
            R.drawable.univ_8,
            R.drawable.univ_9,
            R.drawable.univ_10)

        title1List = arrayOf(
            "Universitas Dinamika",
            "Universitas Ciputra",
            "Universitas Pelita Harapan",
            "Universitas Surabaya",
            "Universitas Katolik Darma Cendika",
            "Universitas Pembangunan Nasional",
            "Universitas Widya Kartika",
            "Universitas Wijaya Kusuma",
            "Universitas Katolik Widya Mandala",
            "Universitas Kristen Petra"
        )

        title2List = arrayOf(
            "Jl. Raya Kedung Baruk No.98, Kedung Baruk",
            "CitraLand CBD Boulevard, Made",
            "Jl. Raya Kedung Baruk No.26-28, Kedung Baruk",
            "Jl. Raya Kalirungkut, Kali Rungkut",
            "Jl. Dr. Ir. H. Soekarno No.201, Klampis Ngasem",
            "Jl.Raya Rungkut Madya, Gunung Anyar",
            "Jl, Jl. Sutorejo Prima Utara II No.1, Kalisari",
            "Dukuh Kupang, Kec. Dukuhpakis",
            "Jl. Dinoyo No.42-44, Keputran",
            "Jl. Siwalankerto No.121-131, Siwalankerto"
        )

        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        datalist = arrayListOf<dataClass>()
        getData()


    }
}