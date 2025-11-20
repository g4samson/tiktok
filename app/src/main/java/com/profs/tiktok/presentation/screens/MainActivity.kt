package com.profs.tiktok.presentation.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.profs.tiktok.presentation.composable.NavGraph
import com.profs.tiktok.presentation.theme.TikTokTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                TikTokTheme {
                val navController = rememberNavController()

                NavGraph(navController)
            }
        }
    }
}