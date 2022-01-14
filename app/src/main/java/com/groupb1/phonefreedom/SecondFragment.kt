package com.groupb1.phonefreedom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.TimePicker
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    val firstFragment = FirstFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val activateButton = view.findViewById<ImageButton>(R.id.deactivateButton)
        activateButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)
        }

        return view

    }

    // ikke færdiggjort
    //private fun getTimePicked() {
        //findViewById<TextView>(R.id.timeLeft)
       // firstFragment.showTimePickerDialog()
}

