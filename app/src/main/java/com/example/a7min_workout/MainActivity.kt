package com.example.a7min_workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.a7min_workout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        val flStartbutton=findViewById<FrameLayout>(R.id.flstart)

        binding?.flBMI?.setOnClickListener{
            Toast.makeText(this, "Let's Generate BMI!!", Toast.LENGTH_SHORT).show()
            val intent2=Intent(this,BMIActivity::class.java)
            startActivity(intent2)
            finish()
        }

        binding?.flstart?.setOnClickListener{
            Toast.makeText(this, "Let's Begin !", Toast.LENGTH_SHORT).show()

            val intent= Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
   override fun onDestroy(){
        super.onDestroy()
        binding =null
    }
}