package com.example.streetwearmagazine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBrands: RecyclerView
    private lateinit var listBrands: ArrayList<Brand>  // Variabel untuk menyimpan daftar brand

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBrands = findViewById(R.id.rv_brands)
        rvBrands.setHasFixedSize(true)

        listBrands = getListBrands()  // Inisialisasi list dari metode getListBrands
        showRecyclerList()
    }

    private fun getListBrands(): ArrayList<Brand> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listBrands = ArrayList<Brand>()
        for (i in dataName.indices) {
            val brand = Brand(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1), "", "")
            listBrands.add(brand)
        }
        dataPhoto.recycle()  // Jangan lupa untuk recycle TypedArray
        return listBrands
    }

    private fun showRecyclerList() {
        rvBrands.layoutManager = LinearLayoutManager(this)
        val listBrandAdapter = ListBrandAdapter(listBrands)
        rvBrands.adapter = listBrandAdapter
    }
}
