package com.example.session7recyclerviewwithbutton
import java.io.Serializable

data class User(
    val id:Int,
    val type:Int,
    val name:String,
    val mail:String,
    val phone:String,
):Serializable
