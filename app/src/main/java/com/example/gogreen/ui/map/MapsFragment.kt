package com.example.gogreen.ui.map

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.gogreen.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions


class MapsFragment : Fragment(), OnMapReadyCallback {

    val markers: MutableList<Marker> = mutableListOf()

    var mMap: GoogleMap? = null
    var cont: ViewGroup? = null

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */

        // Add a marker to Concordia and move the camera
        val concordia = LatLng(45.49535, -73.57801)
        googleMap.addMarker(MarkerOptions().position(concordia).title("Your location"))
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(concordia, 15f))

        val greenPanther = LatLng(45.49756, -73.58011)
        val greenHouse = LatLng(45.49763, -73.57892)
        val locoVilleray= LatLng(45.54316, -73.62881)
        val sampsonEcoshop= LatLng(45.52198, -73.58462)
        val klova= LatLng(45.53034, -73.57797)
        val general54= LatLng(45.52386, -73.593597)
        val bulkAndJars= LatLng(45.53926, -73.60492)
        val cafeX= LatLng(45.50212, -73.57774)
        val frigoVert= LatLng(45.49663, -73.57825)
        val concordiaCooperativeBookstore= LatLng(45.51338, -73.57237)
        val ecollegey= LatLng(45.47020, -73.62818)
        val segals= LatLng(45.51706, -73.57881)
        val mcgillBookstore= LatLng(45.50489, -73.57335)
        val hivecafe = LatLng(45.49736, -73.57903)

        //AZURE = restaurant
        //GREEN = educational
        //YELLOW = groceries
        //VIOLET = shops

        val gp = googleMap.addMarker(MarkerOptions()
                .position(greenPanther)
                .title("Green Panther")
                .snippet("Organic Plant Based Restaurant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        markers.add(gp)

        val gh =googleMap.addMarker(MarkerOptions()
                .position(greenHouse)
                .title("Concordia GreenHouse")
                .snippet("Urban Rooftop Greenhouse")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        markers.add(gh)

        val cx = googleMap.addMarker(MarkerOptions()
                .position(cafeX)
                .title("Café X + Gallery X")
                .snippet("Concordia Student Cafe")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        markers.add(cx)

        val fv = googleMap.addMarker(MarkerOptions()
                .position(frigoVert)
                .title("Frigo-Vert")
                .snippet("Concordia Organic Plant Based Food")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)))
        markers.add(fv)

        val bs = googleMap.addMarker(MarkerOptions()
                .position(concordiaCooperativeBookstore)
                .title("Concordia Community Solidarity Cooperative Bookstore")
                .snippet("Ecofriendly Bookstore")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        markers.add(bs)

        val james = googleMap.addMarker(MarkerOptions()
                .position(mcgillBookstore)
                .title("James McGill Bookstore")
                .snippet("Ecofriendly Bookstore")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        markers.add(james)

        val samp = googleMap.addMarker(MarkerOptions()
                .position(sampsonEcoshop)
                .title("Sampson Ecoshop")
                .snippet("Organic Mini-mart")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))
        markers.add(samp)

        val kl = googleMap.addMarker(MarkerOptions()
                .position(klova)
                .title("Klova")
                .snippet("Organic Superstore")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))
        markers.add(kl)

        val gen = googleMap.addMarker(MarkerOptions()
                .position(general54)
                .title(" Général 54")
                .snippet("Organic Women's Clothing")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))
        markers.add(gen)

        val bj = googleMap.addMarker(MarkerOptions()
                .position(bulkAndJars)
                .title("Bulk & Jars")
                .snippet("Ecofriendly Grocery Store")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)))
        markers.add(bj)

        val eco = googleMap.addMarker(MarkerOptions()
                .position(ecollegey)
                .title("Ecollegey")
                .snippet("Ecofriendly Grocery Store")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)))
        markers.add(eco)

        val seg = googleMap.addMarker(MarkerOptions()
                .position(segals)
                .title("Segals")
                .snippet("Ecofriendly Grocery Store")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)))
        markers.add(seg)

        val hc = googleMap.addMarker(MarkerOptions()
                .position(hivecafe)
                .title("Hive Cafe")
                .snippet("Student-Run Coffee Shop")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        markers.add(hc)
    }

    var v: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        cont = container
        v= inflater.inflate(R.layout.fragment_maps, container, false)
        return v
    }

    override fun onMapReady(googleMap: GoogleMap){
        mMap = googleMap
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)

        val checkBoxView = View.inflate(activity, R.layout.dialog_filtermarker, null)

        val markerBtn = view?.findViewById(R.id.marker_filter) as ImageButton

        val container: ViewGroup? = null

        markerBtn.setOnClickListener{
            val builder = AlertDialog.Builder(activity)
            //set title for alert dialog
            builder.setTitle("Filter Markers")
            //set message for alert dialog
            builder.setMessage("Choose what you wish to filter")
            builder.setView(checkBoxView)

            builder.setPositiveButton("OK"){dialogInterface, which ->
                clearMarkers()
                Toast.makeText(context,"Filtered by Restaurants",Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("Cancel"){dialogInterface, which ->
                Toast.makeText(context,"clicked cancel",Toast.LENGTH_LONG).show()
            }
            //builder.setSingleChoiceItems()
            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
        }

    }

    fun clearMarkers(){

        for(marker in markers){
            marker.setVisible(false)
        }
        markers.find{it.title == "Green Panther"}?.setVisible(true)
        markers.find{it.title == "Café X + Gallery X"}?.setVisible(true)
        markers.find{it.title == "Hive Cafe"}?.setVisible(true)
    }



}