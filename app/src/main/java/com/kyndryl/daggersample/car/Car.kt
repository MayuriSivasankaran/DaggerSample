package com.kyndryl.daggersample.car

import android.util.Log
import javax.inject.Inject


open class Car @Inject constructor(@Inject public var engine:  Engine){

    val TAG = "Car"
    fun drive()
    {
        Log.d(TAG, "drive: Driving...")
    }
}