package com.example.f1_app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.f1_app.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            if (txtfirstname.text.isEmpty() ){
            txtfirstname.error="Champ obligatoire!"

            }
           else if (txtlastname.text.isEmpty()){
                txtlastname.error="Champ obligatoire!"
            }

           else if (!txtfirstname.text.isEmpty()) {
                val intent = Intent(this, MainActivity::class.java)

                intent.putExtra("firstname", txtfirstname.text.toString())
                intent.putExtra("lastname", txtlastname.text.toString())
                startActivity(intent)

            }
        }
        }



}

