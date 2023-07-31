package com.example.a7min_workout;

class ExerciseModel(
        private var id: Int,
        private var image: Int,
        private var isSelected: Boolean,
        private var isCompleted: Boolean,
        private var name: String
){
        fun getid() :Int{
                return id;
        }
        fun setid(id: Int){
                this.id=id
        }

        fun getimage() :Int{
                return image;
        }
        fun setimage(image: Int){
                this.image=image
        }

        fun getisSelected() :Boolean{
                return isSelected;
        }
        fun setisSelected(isSelected: Boolean){
                this.isSelected=isSelected
        }

        fun getname() :String{
                return name;
        }
        fun setname(name: String){
                this.name=name
        }

        fun getisCompleted() :Boolean{
                return isCompleted;
        }
        fun setisCompleted(isCompleted: Boolean){
                this.isCompleted=isCompleted
        }
}
