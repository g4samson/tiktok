package com.profs.tiktok.presentation.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.profs.tiktok.presentation.screens.AlbumScreen
import com.profs.tiktok.presentation.screens.ForYouScreen
import com.profs.tiktok.presentation.screens.FriendsScreen
import com.profs.tiktok.presentation.screens.MessagesScreen
import com.profs.tiktok.presentation.screens.SettingsScreen
import com.profs.tiktok.presentation.screens.UserScreen

@Composable
fun NavGraph(navController: NavHostController) {


    NavHost(navController = navController, startDestination = "for_you") {
        composable("user") { UserScreen(navController) }
        composable("settings") { SettingsScreen(navController) }
        composable("messages") { MessagesScreen(navController) }
        composable("friends") { FriendsScreen(navController) }
        composable("for_you") { ForYouScreen(navController) }
        composable("album") { AlbumScreen(navController) }

    }
}