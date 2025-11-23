package com.profs.tiktok.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.profs.tiktok.R
import com.profs.tiktok.presentation.theme.TikTokDark

@Composable
fun FriendsScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        IconButton(onClick = {navController.navigateUp()}) {
            Icon(painter = painterResource(R.drawable.left_arrow_icon), tint = TikTokDark, contentDescription = null)
        }

    }
}