package com.example.tugaslivedata_news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter (var listNews: ArrayList<ListNews>): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    var onClick :((ListNews) -> Unit)? = null

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view){
        var img = view.findViewById<ImageView>(R.id.imgNews)
        var judul = view.findViewById<TextView>(R.id.txtJudul)
        var tanggal = view.findViewById<TextView>(R.id.txtTanggal)
        var kategori = view.findViewById<TextView>(R.id.txtPenulis)
        var card = view.findViewById<CardView>(R.id.cardNews)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        holder.img.setImageResource(listNews[position].img)
        holder.judul.text = listNews[position].judul
        holder.tanggal.text = listNews[position].Tanggal
        holder.kategori.text = listNews[position].kategori

        holder.card.setOnClickListener{
            onClick?.invoke(listNews[position])
        }
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    fun getDataNews(itemBarang: ArrayList<ListNews>){
        this.listNews = itemBarang
    }
}