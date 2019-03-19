package com.example.pramukh.dashboard_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class getform : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getform)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        var inflater=menuInflater
        inflater.inflate(R.menu.myname,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {


        var inte= Intent(this,loginactivity::class.java)
        inte.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        inte.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        inte.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(inte)
        finish()
        return super.onOptionsItemSelected(item)
    }
}
