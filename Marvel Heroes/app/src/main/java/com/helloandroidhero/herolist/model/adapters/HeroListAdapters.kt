package com.helloandroidhero.herolist.model.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.helloandroidhero.R
import com.helloandroidhero.herolist.model.body.HeroListBody
import com.helloandroidhero.herolist.view.HeroListViewHolder

class HeroListAdapters(val darrHeroList: List<HeroListBody>) : RecyclerView.Adapter<HeroListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroListViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(R.layout.hero_item,parent,false)
        return HeroListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return darrHeroList.count();
    }

    override fun onBindViewHolder(holder: HeroListViewHolder, position: Int) {
        holder?.onBinViewHolder(darrHeroList.get(position).strName!!,darrHeroList.get(position).thumbnail!!.strPath!!)
    }
}