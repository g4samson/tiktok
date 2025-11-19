package com.profs.tiktok.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.profs.tiktok.presentation.composable.CommentsListItem
import com.profs.tiktok.presentation.composable.SharesListItem
import com.profs.tiktok.presentation.theme.Dark
import com.profs.tiktok.presentation.theme.DarkerWhire
import com.profs.tiktok.presentation.theme.DefaultWhite
import com.profs.tiktok.presentation.theme.DivideColor
import com.profs.tiktok.presentation.theme.Gray
import com.profs.tiktok.presentation.theme.LightTextColor
import com.profs.tiktok.presentation.theme.Red
import com.profs.tiktok.presentation.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForYouScreen(navController: NavHostController) {

    var liked by remember { mutableStateOf(false) }
    var showComments by remember { mutableStateOf(false) }
    var showShares by remember { mutableStateOf(false) }


    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent),
        topBar = {
            Text(
                "For You",
                style = Typography.titleLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 55.dp)
            )
        }, bottomBar = if (!showShares && !showComments) {
            {
                Column(
                    modifier = Modifier
                        .height(90.dp)
                        .fillMaxWidth()
                        .background(Color.Black)
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
                                modifier = Modifier
                                    .size(22.dp)
                                    .clickable { navController.navigate("for_you") },
                                tint = DefaultWhite
                            )

                            Spacer(Modifier.height(6.dp))

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
                                modifier = Modifier
                                    .size(22.dp)
                                    .clickable { navController.navigate("album") },
                                tint = DefaultWhite
                            )

                            Spacer(Modifier.height(6.dp))

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

                            Spacer(Modifier.height(6.dp))

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
                                modifier = Modifier
                                    .size(22.dp)
                                    .clickable { navController.navigate("user") },
                                tint = DefaultWhite
                            )

                            Spacer(Modifier.height(6.dp))

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
        } else {
            {}
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painterResource(R.drawable.background),
                    contentScale = ContentScale.FillBounds
                )
                .padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            BottomSheetScaffold(
                sheetContainerColor = DarkerWhire,
                sheetSwipeEnabled = false,
                modifier = Modifier.fillMaxSize(),
                sheetContent = {
                    if (showComments) {
                        Column(modifier = Modifier.fillMaxSize()) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Spacer(modifier = Modifier.size(1.dp))

                                Text(
                                    "579 comments",
                                    style = Typography.titleMedium.copy(
                                        fontWeight = FontWeight.SemiBold,
                                        fontSize = 13.sp
                                    )
                                )
                                IconButton(onClick = { showComments = false }) {
                                    Icon(
                                        painterResource(R.drawable.icon_close),
                                        tint = Dark,
                                        contentDescription = null,
                                        modifier = Modifier.size(10.dp)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(15.dp))

                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .verticalScroll(rememberScrollState())
                                    .padding(horizontal = 16.dp)
                            ) {
                                CommentsListItem(
                                    R.drawable.av_1,
                                    "martini_rond",
                                    "How neatly I write the date in my book",
                                    "22h",
                                    "4",
                                    "8098"
                                )

                                Spacer(modifier = Modifier.height(6.dp))


                                CommentsListItem(
                                    R.drawable.av_2,
                                    "maxjacobson",
                                    "Now that’s a skill very talented",
                                    "22h",
                                    "4",
                                    "8098"
                                )
                                Spacer(modifier = Modifier.height(6.dp))

                                CommentsListItem(
                                    R.drawable.av_3,
                                    "zackjohn",
                                    "Doing this would make me so anxious",
                                    "22h",
                                    "",
                                    "8098"
                                )
                                Spacer(modifier = Modifier.height(6.dp))

                                CommentsListItem(
                                    R.drawable.av_4,
                                    "kiero_d",
                                    "Use that on r air forces to whiten them",
                                    "21h",
                                    "9",
                                    "8098"
                                )
                                Spacer(modifier = Modifier.height(6.dp))

                                CommentsListItem(
                                    R.drawable.av_5,
                                    "mis_potter",
                                    "Sjpuld’ve used that on his forces \uD83D\uDE37\uD83D\uDE37",
                                    "13h",
                                    "4",
                                    "8098"
                                )
                                Spacer(modifier = Modifier.height(6.dp))

                                CommentsListItem(
                                    R.drawable.av_6,
                                    "karennne",
                                    "No prressure",
                                    "22h",
                                    "2",
                                    "8098"
                                )
                                Spacer(modifier = Modifier.height(6.dp))

                                CommentsListItem(
                                    R.drawable.av_7,
                                    "joshua_l",
                                    "My OCD couldn’t do it",
                                    "15h",
                                    "",
                                    "8098"
                                )
                            }

                            Spacer(modifier = Modifier.height(50.dp))

                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(80.dp)
                                    .background(DefaultWhite)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(top = 15.dp)
                                        .background(DefaultWhite),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.Top
                                ) {
                                    Row {
                                        Spacer(Modifier.width(16.dp))

                                        Text(
                                            "Add comment... ",
                                            style = Typography.bodyMedium.copy(
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Normal,
                                                color = LightTextColor
                                            )
                                        )
                                    }

                                    Row {
                                        Icon(
                                            painterResource(R.drawable.ad_sign_stroke_icon),
                                            contentDescription = null,
                                            modifier = Modifier.size(22.dp)
                                        )
                                        Spacer(Modifier.width(22.dp))
                                        Icon(
                                            painterResource(R.drawable.emoji_stroke_icon),
                                            contentDescription = null,
                                            modifier = Modifier.size(22.dp)
                                        )
                                        Spacer(Modifier.width(16.dp))

                                    }
                                }
                            }

                        }

                    } else if (showShares) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Spacer(Modifier.height(10.dp))

                            Text(
                                "Share to",
                                style = Typography.titleMedium.copy(
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 13.sp
                                )
                            )

                            Spacer(Modifier.height(15.dp))


                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState())
                                    .padding(start = 18.dp),
                                horizontalArrangement = Arrangement.spacedBy(18.dp)
                            ) {
                                SharesListItem(R.drawable.whatsapp_logo, "WhatsApp")
                                SharesListItem(R.drawable.whatsapp_logo, "WhatsApp\n" +
                                        "status")
                                SharesListItem(R.drawable.message_logo, "Message")
                                SharesListItem(R.drawable.sms_logo, "SMS")
                                SharesListItem(R.drawable.messenger_logo, "Messenger")
                                SharesListItem(R.drawable.instagram_logo, "Instagram")

                            }

                            Spacer(Modifier.height(2.dp))
                            Spacer(
                                Modifier
                                    .border(0.5.dp, DivideColor.copy(alpha = 0.2f))
                                    .fillMaxWidth()
                                    .height(1.dp).padding(horizontal = 16.dp)
                            )
                            Spacer(Modifier.height(14.dp))


                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState())
                                    .padding(start = 18.dp),
                                horizontalArrangement = Arrangement.spacedBy(18.dp)
                            ) {
                                SharesListItem(R.drawable.report, "Report")
                                SharesListItem(R.drawable.not, "Not\n" +
                                        "interested")
                                SharesListItem(R.drawable.save, "Save video")
                                SharesListItem(R.drawable.duet, "Duet")
                                SharesListItem(R.drawable.react, "React")
                                SharesListItem(R.drawable.fav, "Add to\n" +
                                        "Favorites")

                            }
                            Spacer(Modifier.height(2.dp))


                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(80.dp)
                                    .background(DefaultWhite), horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(top = 15.dp, bottom = 50.dp)
                                        .background(DefaultWhite),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.Top
                                ) {

                                    Text(
                                        "Cancel",
                                        style = Typography.bodyMedium.copy(
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.Normal,
                                            color = Dark
                                        ), modifier = Modifier.clickable { showShares = false }
                                    )

                                }
                            }
                        }
                    }
                },
                containerColor = Color.Transparent,
                sheetPeekHeight = if (showComments) 650.dp else if (showShares) 280.dp else 0.dp,
                sheetDragHandle = {}
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.Bottom
                ) {
                    Column(modifier = Modifier.fillMaxWidth(0.9f)) {
                        Text(
                            "@craig_love",
                            style = Typography.titleLarge.copy(
                                fontSize = 17.sp,
                                textAlign = TextAlign.Start
                            )
                        )

                        Spacer(modifier = Modifier.height(8.dp))
                        Text(buildAnnotatedString {
                            withStyle(
                                SpanStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 15.sp,
                                    color = DefaultWhite
                                )
                            ) {
                                append("The most satisfying Job ")
                            }
                            withStyle(
                                SpanStyle(
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 15.sp, color = DefaultWhite
                                )
                            ) {
                                append("#fyp #satisfying #roadmarking")
                            }
                        }, modifier = Modifier.fillMaxWidth(), lineHeight = 19.5.sp)
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(modifier = Modifier.fillMaxWidth(0.6f)) {
                            Icon(
                                painterResource(R.drawable.icon_music),
                                contentDescription = null,
                                tint = DefaultWhite
                            )
                            Spacer(modifier = Modifier.width(9.dp))

                            Text(
                                "Roddy Roundicch - The Rou",
                                style = Typography.titleLarge.copy(
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Start,
                                    fontSize = 15.sp
                                )
                            )
                        }
                    }

                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(onClick = { liked = !liked }) {
                                Icon(
                                    painterResource(R.drawable.icon_player_heart),
                                    contentDescription = null,
                                    tint = if (liked) Red else DefaultWhite,
                                    modifier = Modifier.size(35.dp)
                                )
                            }
                            Text("328", style = Typography.titleLarge.copy(fontSize = 13.sp))
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(onClick = { showComments = !showComments }) {
                                Icon(
                                    painterResource(R.drawable.icon_player_message),
                                    contentDescription = null,
                                    tint = DefaultWhite,
                                    modifier = Modifier.size(35.dp)
                                )
                            }

                            Text("578", style = Typography.titleLarge.copy(fontSize = 13.sp))
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(onClick = { showShares = !showShares }) {
                                Icon(
                                    painterResource(R.drawable.icon_player_share),
                                    contentDescription = null,
                                    tint = DefaultWhite,
                                    modifier = Modifier.size(35.dp)
                                )
                            }
                            Text("Share", style = Typography.titleLarge.copy(fontSize = 13.sp))

                        }

                        Spacer(modifier = Modifier.height(30.dp))

                        Image(
                            painterResource(R.drawable.disc),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp),
                            contentScale = ContentScale.FillWidth
                        )

                    }
                }
            }
        }
    }
}