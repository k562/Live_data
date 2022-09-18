package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewmModel: MainViewmModel
    lateinit var txt_hello : TextView
    lateinit var Btn_update : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_hello = findViewById(R.id.Txt_hello)
        Btn_update = findViewById(R.id.Btn_update)

       mainViewmModel = ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory
           .getInstance(application))
           .get(MainViewmModel::class.java)

       mainViewmModel.factsLiveData.observe(this) {

           txt_hello.text = it

       }

        Btn_update.setOnClickListener {

            mainViewmModel.updateLiveData()
        }
    }
}