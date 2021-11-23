package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view_tagContainer,firstFragment).commit()
    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message",editTextInput)
        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle
        transaction.replace(R.id.fragment_container2_view_tagContainer,secondFragment)
        transaction.commit()
    }
}