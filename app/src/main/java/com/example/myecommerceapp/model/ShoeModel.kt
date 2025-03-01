package com.example.myecommerceapp.model

import java.io.Serializable

data class ShoeModel(
    val shoeName : String,
    val shoeImage : Int,
    val shoeDescription : String,
    val shoePrice : Double,
    val shoeFrontSide : Int,
    val shoeBackSide : Int,
    val shoeSide : Int,
    var isFavorite : Boolean
) : Serializable
