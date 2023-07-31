package com.example.a7min_workout

import java.util.AbstractList

object Constants {
    fun defaultExerciseList():ArrayList<ExerciseModel>{

        val exerciseList=ArrayList<ExerciseModel>()

        val jumpingJacks=ExerciseModel(
            1,R.drawable.ic_jumping_jacks, false,false,"Jumping Jacks"
        )
        exerciseList.add(jumpingJacks)
        val abdominalCrunch=ExerciseModel(
            2,R.drawable.ic_abdominal_crunch, false,false,"Abdominal Crunches"
        )
        exerciseList.add(abdominalCrunch)
        val highKnees=ExerciseModel(
            3,R.drawable.ic_high_knees_running_in_place, false,false,"High Knees Running"
        )
        exerciseList.add(highKnees)
        val lunge=ExerciseModel(
            4,R.drawable.ic_lunge, false,false,"Lunge"
        )
        exerciseList.add(lunge)
        val plank=ExerciseModel(
            5,R.drawable.ic_plank, false,false,"Planks"
        )
        exerciseList.add(plank)
        val pushUp=ExerciseModel(
            6,R.drawable.ic_push_up, false,false,"Push Ups"
        )
        exerciseList.add(pushUp)
        val rotation=ExerciseModel(
            7,R.drawable.ic_push_up_and_rotation, false,false,"Push up's & rotation"
        )
        exerciseList.add(rotation)
        val splank=ExerciseModel(
            8,R.drawable.ic_side_plank, false,false,"Side planks"
        )
        exerciseList.add(splank)
        val squats=ExerciseModel(
            9,R.drawable.ic_squat, false,false,"Squats"
        )
        exerciseList.add(squats)
        val ontoChair=ExerciseModel(
            10,R.drawable.ic_step_up_onto_chair, false,false,"Step onto Chair"
        )
        exerciseList.add(ontoChair)
        val dipChair=ExerciseModel(
            11,R.drawable.ic_triceps_dip_on_chair, false,false,"Dip's on Chair"
        )
        exerciseList.add(dipChair)
        val wallSit=ExerciseModel(
            12,R.drawable.ic_wall_sit, false,false,"Wall sits"
        )
        exerciseList.add(wallSit)

        return exerciseList
    }
}