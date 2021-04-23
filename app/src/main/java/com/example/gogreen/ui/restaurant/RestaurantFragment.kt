package com.example.gogreen.ui.restaurant

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.example.gogreen.MainDrawerActivity
import com.example.gogreen.R
import com.example.gogreen.ui.popups.GreenPantherPopup
import com.google.android.material.dialog.MaterialDialogs


class RestaurantFragment : Fragment() {

    private lateinit var restaurantViewModel: RestaurantViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        restaurantViewModel =
                ViewModelProvider(this).get(RestaurantViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_restaurant, container, false)
        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val greenpanther = view.findViewById(R.id.cardgreenpanther) as ImageView
        greenpanther.setOnClickListener{
            val dialog = GreenPantherPopup()
            dialog.show(childFragmentManager, "Green Panther")
        }
    }




}