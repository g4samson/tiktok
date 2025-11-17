package com.profs.tiktok.presentation.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.profs.tiktok.presentation.screens.UserScreen

@Composable
fun NavGraph(navController: NavHostController) {


    NavHost(navController = navController, startDestination = "user") {
        composable("user") { UserScreen(navController) }
    }
}