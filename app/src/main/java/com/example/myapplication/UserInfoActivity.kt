package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class UserInfoActivity : Activity() {

    var userInfoText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info);
        userInfoText = findViewById(R.id.userInfoText)
        val firstName = intent.getStringExtra("firstName").toString()
        val middleName = intent.getStringExtra("middleName").toString()
        val lastName = intent.getStringExtra("lastName").toString()
        userInfoText?.text = "Добрый день, $firstName $middleName $lastName"
    }


}