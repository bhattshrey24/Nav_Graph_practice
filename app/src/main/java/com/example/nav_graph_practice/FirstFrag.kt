package com.example.nav_graph_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FirstFrag : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn1 = view.findViewById<Button>(R.id.btnNavToSecondFrag)
        val btn2 = view.findViewById<Button>(R.id.btnNavToThirdFrag)

        btn1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFrag_to_secondFrag)//action_secondFrag_to_thirdFrag is a action
        }

        btn2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFrag_to_thirdFrag2)//action_secondFrag_to_thirdFrag is a action
        }
    }
}