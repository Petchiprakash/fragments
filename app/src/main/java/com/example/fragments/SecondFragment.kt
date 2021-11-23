package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {
    private var displayMessage:String? = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, fragment_container2_view_tagContainer, false)
        displayMessage = arguments?.getString("message")
        view.tvDisplay.text = displayMessage
        return view

    }

}