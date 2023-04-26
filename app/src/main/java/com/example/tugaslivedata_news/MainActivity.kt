package com.example.tugaslivedata_news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugaslivedata_news.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapterProduct : NewsAdapter
    lateinit var productViewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Init productViewModel && Adapter product
        productViewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        adapterProduct = NewsAdapter(ArrayList())

        //Meng observe data dari viewmodel - livedata
        productViewModel.getData()
        productViewModel.productVm.observe(this, Observer {
            adapterProduct.getDataNews(it as ArrayList<ListNews>)
        })

        binding.rvNews.adapter = adapterProduct
        binding.rvNews.layoutManager = GridLayoutManager(this, 2)
    }
}