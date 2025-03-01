package com.example.myecommerceapp.screens.detailscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun ShoeDetailScreen(navController: NavController,name : String ?=null , image : Int?,price : String?,frontSide: Int?,backside : Int?,shoeside : Int?){
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = 8.dp
        ) {
            image?.let { painterResource(id = it) }
                ?.let { Image(
                    painter = it,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                ) }
        }
        Row {
            Text(
                text = "$name",
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier
                    .padding(
                        start = 8.dp, top = 16.dp
                    )
                    .weight(1f)
            )
            
            Text(
                text = "$price €",
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier
                    .padding(top = 16.dp)
            )
        }
        


        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Card(
                modifier = Modifier
                    .size(90.dp)
                    .padding(top=8.dp,start = 16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = 8.dp
            ) {
                image?.let { painterResource(id = it) }
                    ?.let { Image(painter = it, contentDescription = null, contentScale = ContentScale.Crop ) }
            }

            Card(
                modifier = Modifier
                    .size(90.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = 8.dp
            ) {
                frontSide?.let { painterResource(id = it) }
                    ?.let { Image(painter = it, contentDescription = null, contentScale = ContentScale.Crop ) }
            }

            Card(
                modifier = Modifier
                    .size(90.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = 8.dp
            ) {
                backside?.let { painterResource(id = it) }
                    ?.let { Image(painter = it, contentDescription = null, contentScale = ContentScale.Crop ) }
            }

            Card(
                modifier = Modifier
                    .size(90.dp)
                    .padding(8.dp)
                    .background(Color.White),
                shape = RoundedCornerShape(16.dp),
                elevation = 8.dp
            ) {
                shoeside?.let { painterResource(id = it) }
                    ?.let { Image(painter = it, contentDescription = null, contentScale = ContentScale.Crop ) }
            }
        }
        Sizes()
        SizeNumber()
        AddToCart()

    }
}



@Composable
fun Sizes(){
    Column(modifier = Modifier) {
        Row(modifier = Modifier
            .padding(top = 16.dp, start = 8.dp)
        ) {
            Text(text = "Size", style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.weight(1f))

            Text(text = "Size Guide")
        }
    }
}

@Composable
fun SizeNumber(){
    val size = mutableListOf("35","36","37","38","39","40","41","42","43","44")
    LazyRow(modifier = Modifier
        .padding(start= 16.dp, end = 8.dp)
        .fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceEvenly){

        items(size){ size ->
            Box(modifier = Modifier
                .border(1.dp, Color.Black, RoundedCornerShape(16.dp))
                .size(60.dp)
                .fillMaxHeight()
            ){
                Text(text = size
                , modifier = Modifier
                        .padding(start = 20.dp, top = 20.dp)
                        .size(50.dp)
                )
            }
        }
    }
}

@Composable
fun AddToCart(){
    Button(onClick = { /*TODO*/ },
    modifier = Modifier
        .padding(16.dp)
        .clip(CircleShape)
        .background(MaterialTheme.colors.primary)
        .fillMaxWidth(),
    ) {
        Row(horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(start = 8.dp)) {
            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
            Text(text = "ADD TO CART")
        }
    }

}