package com.nasplus.intent_20211118_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }
}