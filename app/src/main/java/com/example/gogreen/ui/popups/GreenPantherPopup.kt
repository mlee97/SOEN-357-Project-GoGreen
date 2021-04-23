package com.example.gogreen.ui.popups

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.example.gogreen.R
import com.example.gogreen.ui.restaurant.RestaurantViewModel

class GreenPantherPopup: DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater!!.inflate(R.layout.popup_greenpanther, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val blankheart = view.findViewById(R.id.blankheart) as ImageView
        val likedheart = view.findViewById(R.id.likedheart) as ImageView
        blankheart.setOnClickListener{
            blankheart.visibility = if (blankheart.visibility == View.VISIBLE){
                View.INVISIBLE
            } else{
                View.VISIBLE
            }
        }
        likedheart.setOnClickListener{
            blankheart.visibility = if (blankheart.visibility == View.INVISIBLE){
                View.VISIBLE
            } else{
                View.INVISIBLE
            }
        }

    }
}