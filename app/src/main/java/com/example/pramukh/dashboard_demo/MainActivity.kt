package com.example.pramukh.dashboard_demo

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.Preference
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_loginactivity.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var splash =findViewById<ImageView>(R.id.splash)
        var animation=AnimationUtils.loadAnimation(this,R.anim.fade)
        splash.animation=animation
        thread(start = true) {
            Thread.sleep(3000)

            var intent = Intent(this, loginactivity::class.java)
            startActivity(intent)
            finish()

        }


    }
}
