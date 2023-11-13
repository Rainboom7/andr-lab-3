package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration

class MainActivity : AppCompatActivity() {
    private var loginButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.button1)

        loginButton?.setOnClickListener { login() }
    }


    fun login() {
        val lastname = findViewById<EditText>(R.id.editText1)?.text.toString()
        val firstname = findViewById<EditText>(R.id.editText2)?.text.toString()
        val middlename = findViewById<EditText>(R.id.editText3)?.text.toString()
        if (firstname?.isBlank() == true || lastname?.isBlank() == true
            || middlename?.isBlank() == true
        ) {
            Toast.makeText(this, "Пожалуйста введите все данные", Toast.LENGTH_SHORT).show();
        } else {
            val intent = Intent(this, UserInfoActivity::class.java)
            intent.putExtra("firstName", firstname)
            intent.putExtra("middleName", middlename)
            intent.putExtra("lastName", lastname)
            startActivity(intent)
        }

    }
}