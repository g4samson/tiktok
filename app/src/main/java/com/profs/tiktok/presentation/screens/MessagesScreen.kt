package com.profs.tiktok.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.profs.tiktok.R
import com.profs.tiktok.presentation.theme.DefaultWhite
import com.profs.tiktok.presentation.theme.Gray
import com.profs.tiktok.presentation.theme.MessageColor
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun MessagesScreen(navController: NavHostController) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(DefaultWhite),
        topBar = {
            Column(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth()
                    .border(0.75.dp, Gray),
            ) {
                Row(
                    modifier = Modifier
                        .height(78.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Row {
                        Spacer(Modifier.width(16.dp))
                        IconButton(
                            onClick = { navController.navigateUp() },
                            modifier = Modifier.size(22.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_back),
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }

                    Text("Direct messages", style = Typography.titleMedium)

                    Row {
                        IconButton(
                            onClick = { navController.navigate("friends") },
                            modifier = Modifier.size(22.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_plus),
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                        Spacer(Modifier.width(16.dp))
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(DefaultWhite)
                .padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(230.dp))

            Icon(
                painterResource(R.drawable.icon_message),
                contentDescription = null,
                tint = MessageColor, modifier = Modifier.size(width = 70.dp, height = 60.dp)
            )

            Spacer(Modifier.height(28.dp))

            Text("Message your friends", style = Typography.titleMedium)
            Spacer(Modifier.height(12.dp))
            Text("Share videos or start a conversation", style = Typography.bodyMedium)
        }
    }
}