package com.example.newsapp

import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.newsapp.R

class NewsViewHolder(view: View): ViewHolder(view) {

    val cbNews: CheckBox = view.findViewById(R.id.cbNews)
    val ivDelete: ImageView = view.findViewById(R.id.ivDelete)
}