package com.example.gogreen.ui.grocery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.gogreen.R

class GroceryFragment : Fragment() {

    private lateinit var groceryViewModel: GroceryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        groceryViewModel =
                ViewModelProvider(this).get(GroceryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_grocery, container, false)

        return root
    }
}