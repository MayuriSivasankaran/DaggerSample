package com.kyndryl.daggersample

import com.kyndryl.daggersample.car.Car
import com.kyndryl.daggersample.car.Engine
import dagger.Component

@Component
public interface AppComponents {
    fun getCar() : Car
}