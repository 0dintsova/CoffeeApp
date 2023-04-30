package com.example.coffeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coffeeapp.databinding.ActivityMainBinding
import com.example.coffeeapp.databinding.ActivityRegOrLoginBinding

class RegOrLogin : AppCompatActivity() {
    private lateinit var bindingClass : ActivityRegOrLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityRegOrLoginBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
}