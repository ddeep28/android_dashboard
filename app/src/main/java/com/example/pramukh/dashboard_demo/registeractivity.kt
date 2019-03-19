package com.example.pramukh.dashboard_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registeractivity.*

class registeractivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeractivity)

        tvback.setOnClickListener {

            var inte=Intent(this,loginactivity::class.java)
            startActivity(inte)
            finish()


        }

    }
}
