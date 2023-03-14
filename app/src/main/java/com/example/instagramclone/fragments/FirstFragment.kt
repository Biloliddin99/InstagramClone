package com.example.instagramclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagramclone.R
import com.example.instagramclone.databinding.FragmentFirstBinding
import com.example.instagramclone.models.Data

class FirstFragment : Fragment() {
    private var list = ArrayList<Data>()

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        binding.btnHome.setOnClickListener {
            val secondFragment = SecondFragment()
            parentFragmentManager.beginTransaction()
                .addToBackStack(secondFragment.toString())
                .replace(R.id.layout,secondFragment)
                .commit()
        }
        return binding.root
    }

}