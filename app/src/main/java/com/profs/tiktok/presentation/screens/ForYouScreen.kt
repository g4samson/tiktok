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
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.profs.tiktok.R
import com.profs.tiktok.presentation.theme.Background
import com.profs.tiktok.presentation.theme.ButtonsOutline
import com.profs.tiktok.presentation.theme.DefWhite
import com.profs.tiktok.presentation.theme.MenuIcons
import com.profs.tiktok.presentation.theme.TikTokDark
import com.profs.tiktok.presentation.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForYouScreen(navController: NavHostController) {
    var showComments by remember { mutableStateOf(false) }
    var showShares by remember { mutableStateOf(false) }


    BottomSheetScaffold(
        containerColor = Color.Transparent,
        sheetContent = {
                if (showComments) {
                    IconButton(onClick = { showComments = false }) {
                        Icon(
                            painterResource(R.drawable.close_icon),
                            tint = TikTokDark,
                            contentDescription = null
                        )
                    }
                } else if (showShares) {
                    Text("Cancel", modifier = Modifier.clickable { showShares = false })
                }
            },
        modifier = Modifier.fillMaxSize(),
        sheetPeekHeight = if (showComments) 654.dp else if (showShares) 309.dp else 0.dp,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painterResource(R.drawable.background),
                    contentScale = ContentScale.FillBounds
                )
                .padding(innerPadding)
                .padding(horizontal = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(55.dp))

            Text(
                "For You",
                style = Typography.titleLarge.copy(
                    color = Background,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .padding(top = 600.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        "@craig_love",
                        style = Typography.titleLarge.copy(
                            color = Background,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )

                    Spacer(Modifier.height(8.dp))

                    Text(
                        buildAnnotatedString {
                            withStyle(SpanStyle(fontWeight = FontWeight.Light)) {
                                append(
                                    "The most satisfying Job "
                                )
                            }

                            withStyle(SpanStyle(fontWeight = FontWeight.SemiBold)) {
                                append(
                                    "#fyp #satisfying #roadmarking"
                                )
                            }
                        },
                        style = Typography.titleLarge.copy(
                            color = Background,
                            fontSize = 15.sp,
                            lineHeight = 19.5.sp, textAlign = TextAlign.Start
                        )
                    )

                    Spacer(Modifier.height(12.dp))

                    Row(modifier = Modifier.fillMaxSize()) {
                        Icon(
                            painterResource(R.drawable.music_icon),
                            contentDescription = null,
                            tint = Background,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(Modifier.width(10.dp))

                        Text(
                            "Roddy Roundicch - The Rou",
                            style = Typography.titleLarge.copy(
                                color = Background,
                                fontSize = 15.sp, fontWeight = FontWeight.Light,
                                lineHeight = 19.5.sp
                            )
                        )

                    }

                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 410.dp),
                    horizontalAlignment = Alignment.End
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            painterResource(R.drawable.heart_icon),
                            contentDescription = null,
                            tint = Background,
                            modifier = Modifier.size(35.dp)
                        )
                        Spacer(Modifier.height(5.dp))
                        Text(
                            "328",
                            style = Typography.titleLarge.copy(
                                color = Background,
                                fontSize = 13.sp, fontWeight = FontWeight.SemiBold,
                            )
                        )
                    }

                    Spacer(Modifier.height(22.5.dp))


                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            painterResource(R.drawable.message_icon),
                            contentDescription = null,
                            tint = Background,
                            modifier = Modifier
                                .size(35.dp)
                                .clickable { showComments = true }
                        )
                        Spacer(Modifier.height(5.dp))
                        Text(
                            "578",
                            style = Typography.titleLarge.copy(
                                color = Background,
                                fontSize = 13.sp, fontWeight = FontWeight.SemiBold,
                            )
                        )
                    }

                    Spacer(Modifier.height(22.5.dp))


                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            painterResource(R.drawable.share_icon),
                            contentDescription = null,
                            tint = Background,
                            modifier = Modifier
                                .size(35.dp)
                                .clickable { showShares = true }
                        )
                        Spacer(Modifier.height(5.dp))
                        Text(
                            "Share",
                            style = Typography.titleLarge.copy(
                                color = Background,
                                fontSize = 13.sp, fontWeight = FontWeight.SemiBold,
                            )
                        )
                    }

                    Spacer(Modifier.height(30.dp))

                    Image(
                        painterResource(R.drawable.disc),
                        contentDescription = null,
                        modifier = Modifier
                            .size(49.dp)
                            .clickable { navController.navigate("album") })


                }
            }
        }


    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(83.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .fillMaxWidth()
                    .padding(bottom = 50.dp, top = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.height(36.5.dp)
                ) {
                    IconButton(onClick = { navController.navigate("for_you") }) {
                        Icon(
                            painterResource(R.drawable.home_solid_icon),
                            tint = Background,
                            contentDescription = null,
                            modifier = Modifier.size(22.dp)
                        )
                    }

                    Text(
                        "Home",
                        style = Typography.titleLarge.copy(
                            fontSize = 10.sp,
                            color = Background,
                            fontWeight = FontWeight.SemiBold,
                            letterSpacing = 0.15.sp
                        )
                    )
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = { }) {
                        Icon(
                            painterResource(R.drawable.search_icon),
                            tint = Background,
                            contentDescription = null,
                            modifier = Modifier.size(22.dp)
                        )
                    }


                    Text(
                        "Discover",
                        style = Typography.titleLarge.copy(
                            fontSize = 10.sp,
                            color = Background,
                            fontWeight = FontWeight.Normal,
                            letterSpacing = 0.15.sp
                        )
                    )
                }


                Icon(
                    painterResource(R.drawable.button_shape__1_),
                    tint = Color.Unspecified,
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 43.dp, height = 28.dp)
                        .clickable { }
                        .padding(top = 3.dp)
                )



                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = { navController.navigate("message") }) {
                        Icon(
                            painterResource(R.drawable.message_stroke_icon),
                            tint = Background,
                            contentDescription = null,
                            modifier = Modifier.size(22.dp)
                        )
                    }

                    Text(
                        "Inbox",
                        style = Typography.titleLarge.copy(
                            fontSize = 10.sp,
                            color = Background,
                            fontWeight = FontWeight.Normal,
                            letterSpacing = 0.15.sp
                        )
                    )
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = { navController.navigate("user") }) {
                        Icon(
                            painterResource(R.drawable.account_stroke_icon),
                            tint = Background,
                            contentDescription = null,
                            modifier = Modifier.size(22.dp)
                        )
                    }

                    Text(
                        "Me",
                        style = Typography.titleLarge.copy(
                            fontSize = 10.sp,
                            color = Background,
                            fontWeight = FontWeight.Normal,
                            letterSpacing = 0.15.sp
                        )
                    )
                }
            }
        }
    }
}