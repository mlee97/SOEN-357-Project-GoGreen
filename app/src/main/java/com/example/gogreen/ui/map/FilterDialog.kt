package com.example.gogreen.ui.map

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialogFragment
import com.example.gogreen.R

class FilterDialog: AppCompatDialogFragment() {

    val checkBoxView = View.inflate(activity, R.layout.dialog_filtermarker, null)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(activity)

        val inflater: LayoutInflater = requireActivity().layoutInflater
        val view = inflater.inflate(R.layout.dialog_filtermarker, null)

        val restoCheck = view?.findViewById(R.id.checkbox_resto) as RadioButton
        val groceryCheck = view?.findViewById(R.id.checkbox_grocery) as RadioButton
        val eduCheck = view?.findViewById(R.id.checkbox_edu) as RadioButton
        val shopCheck = view?.findViewById(R.id.checkbox_shop) as RadioButton

        //set title for alert dialog
        builder.setTitle("Filter Markers")
        //set message for alert dialog
        builder.setMessage("Choose what you wish to filter")
        builder.setView(checkBoxView)

        builder.setPositiveButton("OK"){dialogInterface, which ->
            Toast.makeText(context, "clicked yes" , Toast.LENGTH_LONG).show()
        }
        builder.setNegativeButton("Cancel"){dialogInterface, which ->
            Toast.makeText(context,"clicked cancel", Toast.LENGTH_LONG).show()
        }
        //builder.setSingleChoiceItems()
        val alertDialog: AlertDialog = builder.create()
        return alertDialog
    }
}