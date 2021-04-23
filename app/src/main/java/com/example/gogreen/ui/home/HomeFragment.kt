package com.example.gogreen.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.gogreen.R
import com.example.gogreen.ui.popups.GreenPantherPopup
import com.example.gogreen.ui.restaurant.RestaurantFragment

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        //val textView: TextView = root.findViewById(R.id.text_home)
        /*homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val resto = view.findViewById(R.id.home_resto) as ImageView
        val shop = view.findViewById(R.id.home_shop) as ImageView
        val edu = view.findViewById(R.id.home_edu) as ImageView
        val grocery = view.findViewById(R.id.home_grocery) as ImageView
        resto.setOnClickListener{
            val fragment = RestaurantFragment()
            childFragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit()
        }
    }
}