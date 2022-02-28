package com.sum.viewpage


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.sum.viewpage.databinding.FragmentViewPagerBinding
import com.sum.viewpage.screens.FirstFragment
import com.sum.viewpage.screens.SecondFragment
import com.sum.viewpage.screens.ThirdFragment


class ViewPageFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_third, container, false)
        // _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val view = binding.root



        val fragmentList = arrayListOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment(),
            FourthFragment()
        )

        val adapter =
            ViewPageAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)


        viewPager = binding.viewPager
        binding.viewPager.adapter = adapter
       // viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        tabLayout = binding.tabLayout
        //tabLayout.setupWithViewPager(viewPager)

        //TabLayoutMediator(tabLayout, viewPager) { tab, position -> }.attach()
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            //println("tab ${tab.text}")
            tab.text = "${position + 1}"
        }.attach()


        return view


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
