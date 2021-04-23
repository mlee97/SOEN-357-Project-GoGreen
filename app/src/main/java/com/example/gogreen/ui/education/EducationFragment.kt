package com.example.gogreen.ui.education

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.gogreen.R

class EducationFragment : Fragment() {

    private lateinit var educationViewModel: EducationViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        educationViewModel =
                ViewModelProvider(this).get(EducationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_education, container, false)

        return root
    }
}