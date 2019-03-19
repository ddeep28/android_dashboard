package com.example.pramukh.dashboard_demo

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loginactivity.*

class loginactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)

        login.setOnClickListener {

            var user=uname.text.toString()
            var pas=pass.text.toString()

            if (user=="admin" && pas=="admin")
            {
                var preference=getSharedPreferences("mypref", Context.MODE_PRIVATE)
                var edit=preference.edit()
                edit.putString("uname",user)
                edit.commit()

                var intent=Intent(this,dashboard::class.java)
                startActivity(intent)
                finish()

            }

        }
        register.setOnClickListener {

            var inten=Intent(this,registeractivity::class.java)
            startActivity(inten)
            finish()

        }

    }
}
