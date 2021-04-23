package com.example.gogreen

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker to Concordia and move the camera
        val concordia = LatLng(45.49535, -73.57801)
        mMap.addMarker(MarkerOptions().position(concordia).title("Your location"))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(concordia, 15f))

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

        //AZURE = restaurant
        //GREEN = educational
        //YELLOW = groceries
        //VIOLET = shops

        googleMap.addMarker(MarkerOptions()
            .position(greenPanther)
            .title("Green Panther")
            .snippet("Organic Plant Based Restaurant")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))

        googleMap.addMarker(MarkerOptions()
            .position(greenHouse)
            .title("Concordia GreenHouse")
            .snippet("Urban Rooftop Greenhouse")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))

        googleMap.addMarker(MarkerOptions()
                .position(cafeX)
                .title("Café X + Gallery X ")
                .snippet("Concordia Student Cafe")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))

        googleMap.addMarker(MarkerOptions()
                .position(frigoVert)
                .title("Frigo-Vert")
                .snippet("Concordia Organic Plant Based Food")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))

        googleMap.addMarker(MarkerOptions()
                .position(greenHouse)
                .title("Concordia GreenHouse")
                .snippet("Urban Rooftop Greenhouse")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))

        googleMap.addMarker(MarkerOptions()
                .position(concordiaCooperativeBookstore)
                .title("Concordia Community Solidarity Cooperative Bookstore")
                .snippet("Ecofriendly Bookstore")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))

        googleMap.addMarker(MarkerOptions()
                .position(mcgillBookstore)
                .title("James McGill Bookstore")
                .snippet("Ecofriendly Bookstore")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))

        googleMap.addMarker(MarkerOptions()
                .position(sampsonEcoshop)
                .title("Sampson Ecoshop")
                .snippet("Organic Mini-mart")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))

        googleMap.addMarker(MarkerOptions()
                .position(klova)
                .title("Klova")
                .snippet("Organic Superstore")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))

        googleMap.addMarker(MarkerOptions()
                .position(general54)
                .title(" Général 54")
                .snippet("Organic Women's Clothing")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))

        googleMap.addMarker(MarkerOptions()
                .position(bulkAndJars)
                .title("Bulk & Jars")
                .snippet("Ecofriendly Grocery Store")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)))

        googleMap.addMarker(MarkerOptions()
                .position(ecollegey)
                .title("Ecollegey")
                .snippet("Ecofriendly Grocery Store")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)))

        googleMap.addMarker(MarkerOptions()
                .position(segals)
                .title("Segals")
                .snippet("Ecofriendly Grocery Store")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)))
    }
}