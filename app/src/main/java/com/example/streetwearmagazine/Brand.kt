package com.example.streetwearmagazine

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Brand(
    val name : String,
    val description : String,
    val photo : Int,
    val instagram : String = "",
    val website : String =""

) :Parcelable
