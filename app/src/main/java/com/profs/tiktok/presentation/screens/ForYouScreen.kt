package com.profs.tiktok.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.draw.paint
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
import com.profs.tiktok.presentation.theme.LightTextColor
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun ForYouScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent),
        topBar = {
            Text("For You", style = Typography.titleLarge, modifier = Modifier.fillMaxWidth().padding(top = 55.dp))
        }, bottomBar = {
            Column(
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth().background(Color.Black)
                    .border(1.dp, Color.Black),
            ) {
                Row(
                    modifier = Modifier
                        .height(82.dp)
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Top
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(start = 27.5.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.icon_bottom_home_white),
                            contentDescription = null,
                            modifier = Modifier.size(22.dp), tint = DefaultWhite
                        )

                        Spacer(Modifier.width(10.dp))

                        Text(
                            "Home",
                            style = Typography.bodyMedium.copy(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold,
                                letterSpacing = 0.15.sp, color = DefaultWhite
                            )
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            painter = painterResource(R.drawable.icon_bottom_search),
                            contentDescription = null,
                            modifier = Modifier.size(22.dp).clickable { navController.navigate("album") }, tint = DefaultWhite
                        )

                        Spacer(Modifier.width(10.dp))

                        Text(
                            "Discover",
                            style = Typography.bodyMedium.copy(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                letterSpacing = 0.15.sp, color = DefaultWhite
                            )
                        )
                    }

                    Icon(
                        painter = painterResource(R.drawable.icon_bottom_plus_white),
                        contentDescription = null,
                        modifier = Modifier.size(width = 40.dp, height = 30.dp),
                        tint = Color.Unspecified
                    )

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            painter = painterResource(R.drawable.icon_bottom_message),
                            contentDescription = null,
                            modifier = Modifier
                                .size(22.dp)
                                .clickable { navController.navigate("messages") },
                            tint = DefaultWhite
                        )

                        Spacer(Modifier.width(10.dp))

                        Text(
                            "Inbox",
                            style = Typography.bodyMedium.copy(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                letterSpacing = 0.15.sp, color = DefaultWhite
                            )
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 27.5.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.icon_bottom_user),
                            contentDescription = null,
                            modifier = Modifier.size(22.dp).clickable { navController.navigate("user") }, tint = DefaultWhite
                        )

                        Spacer(Modifier.width(10.dp))

                        Text(
                            "Me",
                            style = Typography.bodyMedium.copy(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold,
                                letterSpacing = 0.15.sp, color = DefaultWhite
                            )
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize().paint(painterResource(R.drawable.background), contentScale = ContentScale.FillBounds)
                .padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }
    }
}