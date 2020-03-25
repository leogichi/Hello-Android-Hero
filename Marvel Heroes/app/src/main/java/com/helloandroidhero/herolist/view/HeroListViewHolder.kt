package com.helloandroidhero.herolist.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.hero_item.view.*

class HeroListViewHolder (viewItem : View): RecyclerView.ViewHolder( viewItem) {

    fun onBinViewHolder(strTextView : String,strUrlIcon:String){
        itemView.tv_hero_name.setText(strTextView)
       // itemView.iv_icon.setImageBitmap(null)
    }

}