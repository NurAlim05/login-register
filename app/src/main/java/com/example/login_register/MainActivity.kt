package com.example.login_register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnlogin : Button
    private lateinit var btnregister : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlogin = findViewById(R.id.btn_login)
        btnlogin.setOnClickListener(this)

        btnregister = findViewById(R.id.btn_register)
        btnregister.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        when(v?.id){
            R.id.btn_login ->{
                val login = Intent(this@MainActivity, login::class.java)
                startActivity(login)

            }
        }

        when(v?.id){
            R.id.btn_register ->{
                val register = Intent(this@MainActivity, register::class.java)
                startActivity(register)

            }
        }
    }



}