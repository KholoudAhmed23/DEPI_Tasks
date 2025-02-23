package com.example.roomdatabase

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserViewModel(application: Application):AndroidViewModel(application) {
    private val userRepo:UserRepo
    val allUser:LiveData<List<User>>
    init {
        val userDao=AppDataBase.detDataBase(application).getDao()
        userRepo= UserRepo(userDao)
        allUser=userRepo.allUser


    }


    fun insert(user: User)=viewModelScope.launch {
        userRepo.insertUser(user)
    }
    fun update(user: User)=viewModelScope.launch {
        userRepo.updateUser(user)
    }
    fun delete(user: User)=viewModelScope.launch {
        userRepo.deleteUser(user)
    }
}