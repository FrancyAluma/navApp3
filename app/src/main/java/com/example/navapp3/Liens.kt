package com.example.navapp3

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Liens() {

    val navController = rememberNavController()

    NavHost(

        navController = navController,
        startDestination = Nzelas.EcranA
    ) {

        composable (Nzelas.EcranA) {
            EcranA(
                vaecranB = {
                    navController.navigate(Nzelas.EcranB )
                }
            )
        }

        composable (Nzelas.EcranB) {

            EcranB(
               navController = navController
            )
        }

        composable (Nzelas.Ecranc + "/{name}") {
            val name = it.arguments?.getString("name")
            EcranC(
                retour = {
                    navController.popBackStack()

                },
                name = name?:"Pas de Nom"
            )
        }
    }
}