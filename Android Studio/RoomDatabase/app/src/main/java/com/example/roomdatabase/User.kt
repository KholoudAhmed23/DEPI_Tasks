package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)val id:Int,
    val name:String,
    val phone:String,
    val mail:String
)

