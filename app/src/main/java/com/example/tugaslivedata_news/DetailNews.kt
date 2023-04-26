package com.example.tugaslivedata_news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaslivedata_news.databinding.ActivityDetailNewsBinding

class DetailNews : AppCompatActivity() {

    lateinit var binding : ActivityDetailNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDetail = intent.getSerializableExtra("detail") as ListNews
        binding.detailImg.setImageResource(getDetail.img)
        binding.detailJudul.text = getDetail.judul
        binding.detailTanggal.text = getDetail.Tanggal
        binding.detaiPenulis.text = getDetail.kategori

    }
}