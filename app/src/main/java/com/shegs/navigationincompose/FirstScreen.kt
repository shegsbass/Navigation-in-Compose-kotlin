package com.shegs.navigationincompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun FirstScreen(navController: NavController){
    NextButton(navController)
}

@Composable
fun NextButton(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Row (
            modifier = Modifier
                .padding(16.dp),
            
        ){
            Button(
                onClick = {
                          navController.navigate("secondScreen")
                },
            ) {
                Text(text = "Next")
            }
        }
    }

}

@Preview(showBackground = false)
@Composable
fun FirstPreview() {
    FirstScreen(navController = rememberNavController())
}