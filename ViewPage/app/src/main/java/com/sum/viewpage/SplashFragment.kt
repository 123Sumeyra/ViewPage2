package com.sum.viewpage

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.sum.viewpage.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    private var _binding: FragmentSplashBinding?=null
    //private var viewPager : ViewPageFragment ?=null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        val view = binding.root
        val yukaridanAsagi = AnimationUtils.loadAnimation(context,R.anim.yukaridan_asagi)
        val asagidanyulari = AnimationUtils.loadAnimation(context,R.anim.asagidan_yukari)


        binding.star.animation=yukaridanAsagi
        binding.textView.animation=asagidanyulari



        Handler(Looper.getMainLooper()).postDelayed({

            // Your Code
            findNavController().navigate(R.id.action_splashFragment_to_viewPageFragment2)
        }, 2200)
        // Inflate the layout for this fragment
        return view
    }

}