package com.example.praktisi3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class dataClassUniversitas(
    var dataImage:Int,
    var dataTitle1:String,
    var dataTitle2:String
) : Parcelable

@Parcelize
data class dataClassPahlawan(
    val nama: String,
    val desk: String,
    val img: Int
) : Parcelable
