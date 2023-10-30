package com.kyndryl.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kyndryl.daggersample.car.Car
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
   @Inject lateinit var car:  Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}