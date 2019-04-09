package com.example.fourapriltest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User("Tanya","Sergey")
        tietMainName.setText(user.name)
        tietMainSurname.setText(user.surname)
    }
    
}

