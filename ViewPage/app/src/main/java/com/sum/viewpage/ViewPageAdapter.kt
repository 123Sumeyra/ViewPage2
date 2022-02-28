package com.sum.viewpage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sum.viewpage.screens.FirstFragment
import com.sum.viewpage.screens.FourthFragment
import com.sum.viewpage.screens.SecondFragment
import com.sum.viewpage.screens.ThirdFragment


class ViewPageAdapter(list:ArrayList<Fragment>, fm:FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fm,lifecycle)
{
    private val fragmentList :ArrayList<Fragment> =list


    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
       //return fragmentList[position]
        when(position){
            0-> return  FirstFragment()
            1 -> return  SecondFragment()
            2 -> return ThirdFragment()
           else -> return  FourthFragment()

        }





    }
}