package com.sum.viewpage.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.sum.viewpage.R
import com.sum.viewpage.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding?=null
    private val binding get() = _binding!!





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        val view = binding.root
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.next2.setOnClickListener {

            viewPager?.currentItem   = 2

        }


        return view
    }

}