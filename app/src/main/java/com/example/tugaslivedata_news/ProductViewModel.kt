package com.example.tugaslivedata_news

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {

    val listProduct = arrayListOf(
        ListNews(R.drawable.ic_launcher_foreground, "Mobil","3juta", "Jihan"),
        ListNews(R.drawable.ic_launcher_foreground, "Mobil","3juta", "Jihan"),
        ListNews(R.drawable.ic_launcher_foreground, "Mobil","3juta", "Jihan"),
        ListNews(R.drawable.ic_launcher_foreground, "Mobil","3juta", "Jihan"),
        ListNews(R.drawable.ic_launcher_foreground, "Mobil","3juta", "Jihan"),
    )

    val productVm : MutableLiveData<List<ListNews>> = MutableLiveData()

    fun getData (){
        productVm.value = listProduct
    }
}