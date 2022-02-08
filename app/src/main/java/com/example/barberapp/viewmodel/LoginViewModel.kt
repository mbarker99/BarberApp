package com.example.barberapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val mobileNo = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    fun login() {
        Log.d(TAG, "Username-> ${mobileNo.value}, Password-> ${password.value}")
    }

    companion object {
        private const val TAG = "LoginViewModel"
    }

}