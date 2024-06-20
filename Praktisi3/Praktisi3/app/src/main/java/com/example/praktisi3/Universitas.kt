package com.example.praktisi3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Universitas : Fragment() {

    private lateinit var  recyclerView: RecyclerView
    private lateinit var datalist: ArrayList<dataClassUniversitas>
    lateinit var imageList:Array<Int>
    lateinit var title1List:Array<String>
    lateinit var title2List:Array<String>

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = dataClassUniversitas(imageList[i], title1List[i], title2List[i])
            datalist.add(dataClass)
        }

        recyclerView.adapter = adapterUniversitas(datalist)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

        arguments?.let {


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_universitas, container, false)

        recyclerView = view.findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)

        datalist = arrayListOf<dataClassUniversitas>()
        getData()

        return view

    }

    companion object {

    }
}