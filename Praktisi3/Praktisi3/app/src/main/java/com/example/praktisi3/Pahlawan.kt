package com.example.praktisi3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Pahlawan : Fragment() {

    private lateinit var rview: RecyclerView
    private val listArr = ArrayList<dataClassPahlawan>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {

        }
    }

    private fun getData(): ArrayList<dataClassPahlawan> {
        val list = ArrayList<dataClassPahlawan>()
        val dataImg = resources.obtainTypedArray(R.array.data_photo)
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDes = resources.getStringArray(R.array.data_description)

        for (i in dataName.indices) {
            val pahlawan = dataClassPahlawan (
                dataName[i],
                dataDes[i],
                dataImg.getResourceId(i, -1)
            )
            list.add(pahlawan)
        }

        return list
    }

    private fun showRV() {
        rview.layoutManager = LinearLayoutManager(requireContext())
        val ListPahlawanAdapter = adapterPahlawan(listArr)

        rview.adapter = ListPahlawanAdapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_pahlawan, container, false)
        rview = view.findViewById(R.id.rview)
        rview.setHasFixedSize(true)

        listArr.addAll(getData())
        showRV()
        return view
    }

    companion object {

    }
}