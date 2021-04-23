package com.example.gogreen.ui.deals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gogreen.R
import com.example.gogreen.ui.grocery.GroceryViewModel

class DealsFragment : Fragment() {

    private lateinit var dealsViewModel:DealsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dealsViewModel =
            ViewModelProvider(this).get(DealsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_deals, container, false)

        return root
    }
}