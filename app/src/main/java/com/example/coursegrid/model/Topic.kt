package com.example.coursegrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.coursegrid.R

data class Topic(
    @StringRes val name: Int,
    val availableCourses: Int,
    @DrawableRes val imageRes: Int
)

