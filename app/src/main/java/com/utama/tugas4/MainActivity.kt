package com.utama.tugas4
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvBarang = findViewById<RecyclerView>(R.id.rvBarang)

        val listDataBarang = listOf(
            Barang(1, "Laptop Axioo HYPE 5 AMD", "Ryzen 5, RAM 8GB"),
            Barang(2, "Mouse Logitech", "Wireless silent click"),
            Barang(3, "Keyboard Mechanical", "RGB Backlight, White Switch"),
            Barang(4, "Monitor Samsung 24'", "Curved display 75Hz"),
            Barang(5, "Headset SteelSeries", "Surround sound 7.1")
        )

        rvBarang.layoutManager = LinearLayoutManager(this)

        val adapterBarang = BarangAdapter(listDataBarang)
        rvBarang.adapter = adapterBarang
    }
}