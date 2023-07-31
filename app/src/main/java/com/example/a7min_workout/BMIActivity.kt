package com.example.a7min_workout

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.a7min_workout.databinding.ActivityBmiactivityBinding
import com.example.a7min_workout.databinding.DialogCustomBackConfirmationBinding
import java.math.BigDecimal
import java.math.RoundingMode

class BMIActivity : AppCompatActivity() {

    private var binding : ActivityBmiactivityBinding ?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBmiactivityBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.llDiplayBMIResult?.visibility= View.INVISIBLE

        setSupportActionBar(binding?.toolbarBMI)
        if(supportActionBar !=null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        binding?.toolbarBMI?.setNavigationOnClickListener{
            customDialogforBackButton()
        }
        binding?.btnCalculateUnits?.setOnClickListener {
            if(validateMetricUnits()){
                val htval : Float=binding?.etunitht?.text.toString().toFloat()/100
                val wtval : Float=binding?.etunitwt?.text.toString().toFloat()

                val bmi=wtval/(htval*htval)
                displayBMIResult(bmi)
            }
            else
            {
                Toast.makeText(this, "Please Enter valid data. ", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private  fun displayBMIResult(bmi :Float){
        val bmiLabel : String
        val bmiDescription : String

        if (bmi.compareTo(15f)<=0){
            bmiLabel="Very Severly UnderWeight"
            bmiDescription="Opps !! you really need to take better care of yourself.Eat more!!"
        }
        else if(bmi.compareTo(15f)>0&&bmi.compareTo(18.5f)<0){
            bmiLabel="UnderWeight"
            bmiDescription="Opps !! you really need to take better care of yourself.Eat more!!"
        }
        else if(bmi.compareTo(18.5f)>0&&bmi.compareTo(25f)<0){
            bmiLabel="Congratulations"
            bmiDescription="You are Perfectly fine."
        }else if (java.lang.Float.compare(bmi, 25f) > 0 && java.lang.Float.compare(bmi, 30f) <= 0) {
            bmiLabel = "Overweight"
            bmiDescription = "Oops! You really need to take care of your yourself! Workout maybe!"
        } else if (bmi.compareTo(30f) > 0 && bmi.compareTo(35f) <= 0) {
            bmiLabel = "Obese Class | (Moderately obese)"
            bmiDescription = "Oops! You really need to take care of your yourself! Workout maybe!"
        } else if (bmi.compareTo(35f) > 0 && bmi.compareTo(40f) <= 0) {
            bmiLabel = "Obese Class || (Severely obese)"
            bmiDescription = "OMG! You are in a very dangerous condition! Act now!"
        } else {
            bmiLabel = "Obese Class ||| (Very Severely obese)"
            bmiDescription = "OMG! You are in a very dangerous condition! Act now!"
        }
        val bmiVal=BigDecimal(bmi.toDouble()).setScale(2,RoundingMode.HALF_EVEN).toString()

        binding?.llDiplayBMIResult?.visibility= View.VISIBLE
        binding?.tvBMIType?.text=bmiLabel
        binding?.tvBMIValue?.text=bmiVal
        binding?.tvBMIDescription?.text=bmiDescription
    }

    private fun customDialogforBackButton(){
        val customDialog= Dialog(this)
        val dialogBinding= DialogCustomBackConfirmationBinding.inflate(layoutInflater)

        customDialog.setContentView(dialogBinding.root)
        customDialog.setCanceledOnTouchOutside(false)
        dialogBinding.btnYes.setOnClickListener{
            this@BMIActivity.finish()
            customDialog.dismiss()
        }
        dialogBinding.btnNo.setOnClickListener{
            customDialog.dismiss()
        }
        customDialog.show()

    }


    private fun validateMetricUnits():Boolean{
        var isValid=true

        if(binding?.etunitwt?.text.toString().isEmpty()){
            Toast.makeText(this, "Please Enter the Data.", Toast.LENGTH_SHORT).show()
            isValid=false
        }
        else if(binding?.etunitht?.text.toString().isEmpty()){
            isValid=false
        }
        return isValid
    }
}