package com.example.nav_graph_practice

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


class SecondFrag : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.btnNavToThirdFromSec)

        btn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFrag_to_thirdFrag)//action_secondFrag_to_thirdFrag is a action
        }

    }
}