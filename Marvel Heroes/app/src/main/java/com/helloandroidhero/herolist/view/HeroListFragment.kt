package com.helloandroidhero.herolist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.helloandroidhero.R
import com.helloandroidhero.herolist.IHeroListMvp
import com.helloandroidhero.herolist.model.adapters.HeroListAdapters
import com.helloandroidhero.herolist.model.body.HeroListBody
import com.helloandroidhero.root.App
import kotlinx.android.synthetic.main.fragment_hero_list.*
import javax.inject.Inject


//=====================================================================================================================
class HeroListFragment : Fragment(),IHeroListMvp.iView {

    /*MVP Variables*/
    //------------------------------------------------------------------------------------------------------------------
    @Inject
    lateinit var iPresenter:IHeroListMvp.iPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity()!!.application as App).getComponent().inject(this)
        iPresenter.setView(this)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hero_list, container, false)




    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iPresenter.getResultsHeroList()


    }
    override fun goHeroDetails() {
        //                                                 //Go to detail
    }

    override fun setAdapter(darrHeroes: List<HeroListBody>) {

        rv_hero_list.layoutManager = LinearLayoutManager(context)
        rv_hero_list.adapter = HeroListAdapters(darrHeroes)
    }



}
//=====================================================================================================================
/*END-TASK*/
