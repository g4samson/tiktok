package com.profs.tiktok.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.profs.tiktok.R
import com.profs.tiktok.presentation.composable.FriendsListItem
import com.profs.tiktok.presentation.theme.Dark
import com.profs.tiktok.presentation.theme.DefaultWhite
import com.profs.tiktok.presentation.theme.Gray
import com.profs.tiktok.presentation.theme.SearchColor
import com.profs.tiktok.presentation.theme.TextColor
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun FriendsScreen(navController: NavHostController) {
    var value by remember { mutableStateOf("") }


    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(DefaultWhite),
        topBar = {
            Column(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth()
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

                    Text("Find friends", style = Typography.titleMedium)

                    Row {
                        IconButton(
                            onClick = { navController.navigate("friends") },
                            modifier = Modifier.size(22.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_scan),
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
                .padding(horizontal = 16.dp)
                .padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(16.dp))


            TextField(
                value,
                onValueChange = { value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(36.dp)
                    .background(
                        SearchColor, RoundedCornerShape(4.dp)
                    )
                    .clip(RoundedCornerShape(4.dp)),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = SearchColor,
                    focusedContainerColor = SearchColor,
                    unfocusedTextColor = TextColor,
                    focusedTextColor = TextColor
                ),
                leadingIcon = {
                    Row(
                        modifier = Modifier.fillMaxHeight(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painterResource(R.drawable.icon_search),
                            contentDescription = null,
                            tint = Dark, modifier = Modifier.size(14.dp)
                        )
                    }
                }, label = {Text("Search", style = Typography.bodyMedium)}
            )
            Spacer(Modifier.height(6.dp))

            FriendsListItem(R.drawable.card_invite, "Invite friends")
            FriendsListItem(R.drawable.card_find, "Find contacts")
            FriendsListItem(R.drawable.card_facebook, "Find Facebook friends")

        }
    }
}