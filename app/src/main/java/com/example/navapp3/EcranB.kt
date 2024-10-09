package com.example.navapp3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun EcranB(
    navController : NavHostController,
) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Ecran B "
        )
        Button(
            onClick = {
                navController.popBackStack()
                navController.navigate(Nzelas.Ecranc + "/Francy")
            }
        ) {
            Text(
                text = "Aller à l'écran C"
            )
        }
    }
}