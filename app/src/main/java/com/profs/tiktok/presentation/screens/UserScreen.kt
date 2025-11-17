package com.profs.tiktok.presentation.screens

import android.widget.Space
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.profs.tiktok.R
import com.profs.tiktok.presentation.theme.Dark
import com.profs.tiktok.presentation.theme.DefaultWhite
import com.profs.tiktok.presentation.theme.Gray
import com.profs.tiktok.presentation.theme.IconColor
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun UserScreen(navController: NavHostController) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(DefaultWhite),
        topBar = {
            Row(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth().border(1.dp, Gray),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    painter = painterResource(R.drawable.icon_add),
                    contentDescription = null,
                    modifier = Modifier.size(22.dp)
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp), verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Jacob West", style = Typography.titleMedium)
                    Icon(
                        painterResource(R.drawable.icon_more),
                        contentDescription = null,
                        modifier = Modifier.size(10.dp)
                    )
                }

                Icon(
                    painter = painterResource(R.drawable.icon_menu),
                    contentDescription = null,
                    modifier = Modifier.size(22.dp)
                )
            }
        }, bottomBar = {}
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(DefaultWhite)
                .padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(16.dp))

            Image(
                painterResource(R.drawable.img_avatar),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )

            Spacer(Modifier.height(11.dp))

            Text("@jacob_w", style = Typography.titleMedium.copy(fontWeight = FontWeight.SemiBold))

            Spacer(Modifier.height(16.dp))

            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(45.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("14", style = Typography.titleMedium)
                    Text("Following", style = Typography.bodyMedium.copy(fontSize = 13.sp))
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("38", style = Typography.titleMedium)
                    Text("Followers", style = Typography.bodyMedium.copy(fontSize = 13.sp))
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("91", style = Typography.titleMedium)
                    Text("Likes", style = Typography.bodyMedium.copy(fontSize = 13.sp))
                }
            }

            Spacer(Modifier.height(16.dp))

            Row(modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Button(
                    onClick = { }, colors = ButtonDefaults.buttonColors(DefaultWhite),
                    modifier = Modifier
                        .width(160.dp)
                        .height(44.dp)
                        .border(1.dp, Gray)
                ) {
                    Text(
                        "Edit profile",
                        style = Typography.titleMedium.copy(color = Color.Black, fontSize = 15.sp)
                    )
                }

                IconButton(onClick = {}, modifier = Modifier.border(1.dp, Gray)) {
                    Icon(
                        painterResource(R.drawable.icon_bookmark),
                        contentDescription = null,
                        modifier = Modifier.size(22.dp),
                        tint = Dark
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            Text("Tap to add bio", style = Typography.bodyMedium)

            Spacer(Modifier.height(20.dp))

            Row(
                Modifier
                    .fillMaxWidth()
                    .border(1.dp, Gray),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(0.5f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.icon_nav_tab),
                            contentDescription = null,
                            modifier = Modifier
                                .width(50.dp)
                                .height(20.dp), tint = Dark
                        )
                    }
                    Spacer(Modifier.height(10.dp))

                    Icon(
                        painterResource(R.drawable.icon_nav_line),
                        contentDescription = null,
                        modifier = Modifier
                            .width(50.dp)
                            .height(10.dp), tint = Dark
                    )
                }

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.icon_nav_fav),
                            contentDescription = null,
                            modifier = Modifier
                                .width(20.dp)
                                .height(16.dp), tint = IconColor
                        )
                    }
                }
            }

            LazyVerticalGrid(
                modifier = Modifier.fillMaxWidth(),
                columns = GridCells.Fixed(3),
                horizontalArrangement = Arrangement.spacedBy(2.dp),
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                item {
                    Image(
                        painter = painterResource(R.drawable.img_1),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                    )
                }
                item {
                    Image(
                        painter = painterResource(R.drawable.img_2),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                    )
                }
                item {
                    Image(
                        painter = painterResource(R.drawable.img_3),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                    )
                }
                item {
                    Image(
                        painter = painterResource(R.drawable.img_4),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                    )
                }
            }
        }

    }


}