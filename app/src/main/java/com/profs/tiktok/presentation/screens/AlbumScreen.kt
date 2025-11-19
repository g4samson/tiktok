package com.profs.tiktok.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.profs.tiktok.R
import com.profs.tiktok.presentation.theme.Dark
import com.profs.tiktok.presentation.theme.DefaultWhite
import com.profs.tiktok.presentation.theme.Gray
import com.profs.tiktok.presentation.theme.TikTok
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun AlbumScreen(navController: NavHostController) {

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

                    Row {
                        IconButton(
                            onClick = { navController.navigate("friends") },
                            modifier = Modifier.size(22.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_share),
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

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
                    .padding(horizontal = 18.dp)
                    .height(120.dp)
            ) {
                Box(modifier = Modifier.size(120.dp), contentAlignment = Alignment.Center) {
                    Image(
                        painterResource(R.drawable.album),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds
                    )
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.icon_play),
                            tint = DefaultWhite,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                }

                Spacer(modifier = Modifier.width(14.dp))

                Column {
                    Text(
                        "The Round",
                        style = Typography.titleMedium.copy(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        "Roddy Roundicch",
                        style = Typography.bodyMedium.copy(
                            fontSize = 13.sp,
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        "1.7M videos",
                        style = Typography.bodyMedium.copy(
                            fontSize = 13.sp,
                        )
                    )
                    Spacer(modifier = Modifier.height(25.dp))


                    Box(
                        modifier = Modifier
                            .width(152.dp)
                            .height(30.dp)
                            .border(1.dp, Gray, RoundedCornerShape(2.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painterResource(R.drawable.icon_bookmark),
                                contentDescription = null,
                                tint = Dark,
                                modifier = Modifier.size(12.dp)
                            )
                            Spacer(modifier = Modifier.width(2.dp))

                            Text(
                                "Add to Favorites",
                                style = Typography.titleMedium.copy(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 14.sp, textAlign = TextAlign.Start
                                ),
                                maxLines = 1
                            )
                        }
                    }



                }

            }

            Spacer(modifier = Modifier.height(35.dp))

            LazyVerticalGrid(
                modifier = Modifier.fillMaxWidth(),
                columns = GridCells.Fixed(3),
                horizontalArrangement = Arrangement.spacedBy(2.dp),
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                item {
                    Image(
                        painter = painterResource(R.drawable.alb_1),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }
                item {
                    Image(
                        painter = painterResource(R.drawable.alb_2),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }
                item {
                    Image(
                        painter = painterResource(R.drawable.alb_3),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }
                item {
                    Image(
                        painter = painterResource(R.drawable.alb_4),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }

                item {
                    Image(
                        painter = painterResource(R.drawable.alb_5),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }

                item {
                    Image(
                        painter = painterResource(R.drawable.alb_6),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }

                item {
                    Image(
                        painter = painterResource(R.drawable.alb_7),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }

                item {
                    Image(
                        painter = painterResource(R.drawable.alm_12),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }

                item {
                    Image(
                        painter = painterResource(R.drawable.alb_8),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }

                item {
                    Image(
                        painter = painterResource(R.drawable.alb_9),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }

                item {
                    Image(
                        painter = painterResource(R.drawable.alb_10),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }

                item {
                    Image(
                        painter = painterResource(R.drawable.alb_11),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .width(140.dp)
                            .height(180.dp)
                            .clickable { }
                    )
                }
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize().padding(bottom = 46.dp), contentAlignment = Alignment.BottomCenter) {
        Row(
            modifier = Modifier
                .width(180.dp)
                .height(50.dp)
                .background(
                    TikTok, RoundedCornerShape(26.dp)
                )
                .clip(RoundedCornerShape(26.dp)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painterResource(R.drawable.icon_videocamera),
                contentDescription = null,
                tint = DefaultWhite,
                modifier = Modifier.size(22.dp)
            )

            Spacer(Modifier.width(6.dp))

            Text("Use this sound", style = Typography.titleLarge)
        }
    }
}