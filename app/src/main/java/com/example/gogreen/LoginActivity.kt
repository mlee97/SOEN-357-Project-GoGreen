package com.example.gogreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.content.Intent
import android.view.View.OnClickListener

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var email_txtbox = findViewById(R.id.emailAddress) as EditText
        var password_txtbox = findViewById(R.id.password) as EditText
        var btn = findViewById(R.id.signInButton) as Button

        btn.setOnClickListener {
            var email = email_txtbox.text.toString()
            var password = password_txtbox.text.toString()

            val intent = Intent(this, MainDrawerActivity::class.java)

            if(email == "admin@gmail.com"){
                startActivity(intent)
            }

        }

    }



}