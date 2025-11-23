package com.profs.tiktok.presentation.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.profs.tiktok.R
import com.profs.tiktok.data.models.Constants
import com.profs.tiktok.domain.Module
import com.profs.tiktok.presentation.theme.ButtonsOutline
import com.profs.tiktok.presentation.theme.DefWhite
import com.profs.tiktok.presentation.theme.IconOnProfile
import com.profs.tiktok.presentation.theme.MenuIcons
import com.profs.tiktok.presentation.theme.SubText
import com.profs.tiktok.presentation.theme.TikTokDark
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun UserScreen(navController: NavHostController) {


    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(88.dp)
                    .border(1.dp, ButtonsOutline),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(44.dp)
                        .padding(top = 44.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.width(16.dp))

                            IconButton(
                                onClick = {}
                            ) {
                                Icon(
                                    painterResource(R.drawable.add_account_icon),
                                    contentDescription = null,
                                    tint = TikTokDark,
                                    modifier = Modifier.size(22.dp)
                                )


                            }
                        }

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Jacob West", style = Typography.titleLarge)
                            Spacer(modifier = Modifier.width(2.dp))
                            Icon(
                                painter = painterResource(R.drawable.polygon_1),
                                contentDescription = null,
                                tint = TikTokDark,
                                modifier = Modifier
                                    .size(10.dp)
                                    .padding(top = 3.dp)
                            )
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {

                            IconButton(onClick = {navController.navigate("settings")}) {
                                Icon(
                                    painterResource(R.drawable.menu_icon),
                                    tint = TikTokDark,
                                    contentDescription = null,
                                    modifier = Modifier.size(22.dp)
                                )
                            }

                            Spacer(modifier = Modifier.width(16.dp))

                        }
                    }
                }
            }
        },
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, ButtonsOutline)
                    .height(83.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 30.dp)
                        .fillMaxWidth().padding(bottom = 50.dp, top = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.height(36.5.dp)) {
                        IconButton(onClick = { navController.navigate("for_you") }) {
                            Icon(
                                painterResource(R.drawable.home_stroke_icon),
                                tint = MenuIcons,
                                contentDescription = null,
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        Text(
                            "Home",
                            style = Typography.titleLarge.copy(
                                fontSize = 10.sp,
                                color = TikTokDark,
                                fontWeight = FontWeight.SemiBold,
                                letterSpacing = 0.15.sp
                            )
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        IconButton(onClick = { }) {
                            Icon(
                                painterResource(R.drawable.search_icon),
                                tint = MenuIcons,
                                contentDescription = null,
                                modifier = Modifier.size(22.dp)
                            )
                        }


                        Text(
                            "Discover",
                            style = Typography.titleLarge.copy(
                                fontSize = 10.sp,
                                color = MenuIcons,
                                fontWeight = FontWeight.Normal,
                                letterSpacing = 0.15.sp
                            )
                        )
                    }


                    Icon(
                        painterResource(R.drawable.button_shape),
                        tint = Color.Unspecified,
                        contentDescription = null,
                        modifier = Modifier
                            .size(width = 43.dp, height = 28.dp)
                            .clickable { }.padding(top = 3.dp)
                    )



                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        IconButton(onClick = { navController.navigate("message") }) {
                            Icon(
                                painterResource(R.drawable.message_stroke_icon),
                                tint = MenuIcons,
                                contentDescription = null,
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        Text(
                            "Inbox",
                            style = Typography.titleLarge.copy(
                                fontSize = 10.sp,
                                color = MenuIcons,
                                fontWeight = FontWeight.Normal,
                                letterSpacing = 0.15.sp
                            )
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        IconButton(onClick = { navController.navigate("user") }) {
                            Icon(
                                painterResource(R.drawable.account_solid_icon),
                                tint = TikTokDark,
                                contentDescription = null,
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        Text(
                            "Me",
                            style = Typography.titleLarge.copy(
                                fontSize = 10.sp,
                                color = TikTokDark,
                                fontWeight = FontWeight.Normal,
                                letterSpacing = 0.15.sp
                            )
                        )
                    }
                }
            }
        }, modifier = Modifier.fillMaxSize(), containerColor = DefWhite
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(Modifier.height(16.dp))
            Image(
                painterResource(R.drawable.av),
                contentDescription = null,
                modifier = Modifier.size(96.dp)
            )
            Spacer(Modifier.height(11.dp))

            Text("@jacob_w", style = Typography.titleLarge.copy(fontWeight = FontWeight.SemiBold))
            Spacer(Modifier.height(15.dp))

            Row(
                modifier = Modifier.width(230.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("14", style = Typography.titleLarge)
                    Text(
                        "Following",
                        style = Typography.titleLarge.copy(
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp,
                            color = SubText
                        )
                    )
                }

                Spacer(Modifier.width(35.dp))


                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("38", style = Typography.titleLarge)
                    Text(
                        "Followers",
                        style = Typography.titleLarge.copy(
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp,
                            color = SubText
                        )
                    )
                }

                Spacer(Modifier.width(46.dp))


                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("91", style = Typography.titleLarge)
                    Text(
                        "Likes",
                        style = Typography.titleLarge.copy(
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp,
                            color = SubText
                        )
                    )
                }
            }
            Spacer(Modifier.height(16.dp))


            Row(verticalAlignment = Alignment.CenterVertically) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(164.dp)
                        .height(44.dp)
                        .border(1.dp, ButtonsOutline),
                    colors = ButtonDefaults.buttonColors(DefWhite)
                ) {
                    Text(
                        "Edit profile",
                        style = Typography.titleLarge.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            fontSize = 15.sp
                        )
                    )
                }

                Spacer(Modifier.width(4.dp))

                IconButton(modifier = Modifier.border(1.dp, ButtonsOutline), onClick = {}) {
                    Icon(
                        painterResource(R.drawable.bookmark_icon),
                        contentDescription = null,
                        tint = TikTokDark,
                        modifier = Modifier.size(22.dp)
                    )
                }
            }


            Spacer(Modifier.height(19.dp))

            Text(
                "Tap to add bio",
                style = Typography.titleLarge.copy(
                    fontSize = 14.sp,
                    color = SubText,
                    fontWeight = FontWeight.Normal
                )
            )

            Spacer(Modifier.height(21.dp))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, ButtonsOutline),
                horizontalArrangement = Arrangement.Center,
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 11.dp)
                            .fillMaxWidth(0.5f), horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painterResource(R.drawable.tabs_icon),
                                tint = TikTokDark,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                                    .clickable {}
                            )
                            Spacer(Modifier.height(10.dp))

                            Icon(
                                painterResource(R.drawable.line_1),
                                tint = TikTokDark,
                                contentDescription = null,
                                modifier = Modifier.size(width = 48.dp, height = 4.dp)
                            )
                        }

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painterResource(R.drawable.heart_hide_stroke_icon),
                            tint = IconOnProfile,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .clickable {}
                        )
                    }
                }
            }

            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                horizontalArrangement = Arrangement.spacedBy(1.6.dp),
                verticalArrangement = Arrangement.spacedBy(1.3.dp)
            ) {
                items(Module().getUserImage()) { image ->
                    Image(
                        painterResource(image.image),
                        contentDescription = null,
                        modifier = Modifier
                            .width(137.dp)
                            .height(182.dp)
                    )
                }
            }
        }

    }
}