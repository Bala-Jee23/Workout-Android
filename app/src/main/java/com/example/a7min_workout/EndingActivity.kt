package com.example.a7min_workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EndingActivity : AppCompatActivity() {

    private var btnFinish: Button? =null
    private var btnEnd: Button? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ending)
        btnFinish=findViewById(R.id.btnStart)
        btnEnd=findViewById(R.id.btnEnd)
        btnFinish?.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnEnd?.setOnClickListener{
            finish()
        }
    }
}