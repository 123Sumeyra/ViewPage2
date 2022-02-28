package com.sum.viewpage.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.sum.viewpage.R
import com.sum.viewpage.databinding.FragmentSecondBinding
import com.sum.viewpage.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private var _binding: FragmentThirdBinding?=null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        val view = binding.root
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.finish.setOnClickListener {

            viewPager?.currentItem   = 3

        }
        // Inflate the layout for this fragment
        return view
    }

}