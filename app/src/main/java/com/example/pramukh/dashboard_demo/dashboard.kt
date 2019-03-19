package com.example.pramukh.dashboard_demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_dashboard.*

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        var actionBar=supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)


        card1.setOnClickListener{

         var inte=Intent(this,cardactivity::class.java)
            startActivity(inte)

        }
        card2.setOnClickListener {
            var inte=Intent(this,cardactivity2::class.java)
            startActivity(inte)

        }
        card3.setOnClickListener {

            var inte=Intent(this,cardactivity3::class.java)
            startActivity(inte)
        }

        card4.setOnClickListener {

            var inte=Intent(this,cardactivity4::class.java)
            startActivity(inte)
        }
        card5.setOnClickListener {

            var inte=Intent(this,cardactivity5::class.java)
            startActivity(inte)
        }
        card6.setOnClickListener {

            var inte=Intent(this,cardactivity6::class.java)
            startActivity(inte)
        }
        card7.setOnClickListener {

            var inte=Intent(this,cardactivity7::class.java)
            startActivity(inte)
        }

        floatingActionButton.setOnClickListener {

            var inte=Intent(this,getform::class.java)
            startActivity(inte)



        }
        floatingActionButton1.setOnClickListener {

            var inte=Intent(this,getposter::class.java)
            startActivity(inte)

        }






    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        var inflater=menuInflater
        inflater.inflate(R.menu.myname,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {


        var inte=Intent(this,loginactivity::class.java)
        inte.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        inte.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        inte.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(inte)
        finish()
        return super.onOptionsItemSelected(item)
    }
}
