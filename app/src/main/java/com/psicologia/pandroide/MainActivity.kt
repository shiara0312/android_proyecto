package com.psicologia.pandroide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showHome()

        registration.setOnClickListener {
            showRegistration()
        }
        login.setOnClickListener {
            showLogIN()
        }
    }


    private fun showRegistration(){
        registration_layout.visibility= View.VISIBLE
        login_layout.visibility=View.GONE
        home_ll.visibility=View.GONE
    }

    private fun showLogIN(){
        registration_layout.visibility=View.GONE
        login_layout.visibility=View.VISIBLE
        home_ll.visibility=View.GONE
    }
    private fun showHome(){
        registration_layout.visibility=View.GONE
        login_layout.visibility=View.GONE
        home_ll.visibility=View.VISIBLE

    }
}
