package com.example.listapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(val title: String, val description: String, val image: Int): Parcelable
