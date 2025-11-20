package com.profs.tiktok.presentation.screens

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.profs.tiktok.R
import com.profs.tiktok.presentation.composable.SettingsListItem
import com.profs.tiktok.presentation.theme.Dark
import com.profs.tiktok.presentation.theme.DefaultWhite
import com.profs.tiktok.presentation.theme.DivideColor
import com.profs.tiktok.presentation.theme.Gray
import com.profs.tiktok.presentation.theme.LightTextColor
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun SettingsScreen(navController: NavHostController) {

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
                    verticalAlignment = Alignment.Bottom
                ) {
                    Spacer(modifier = Modifier.width(10.dp))
                    IconButton(
                        onClick = { navController.navigateUp() },
                        modifier = Modifier.size(22.dp)
                    ) {
                        Icon(
                            painterResource(R.drawable.icon_back),
                            contentDescription = null,
                            tint = Dark,
                            modifier = Modifier.size(18.dp)
                        )
                    }

                    Text(
                        "Privacy and settings",
                        style = Typography.titleMedium,
                        modifier = Modifier.padding(start = 90.dp)
                    )
                }
            }
        }, containerColor = DefaultWhite
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .background(DefaultWhite)
                .verticalScroll(rememberScrollState())
                .padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(Modifier.height(20.dp))


            Text("ACCOUNT", style = Typography.titleSmall, modifier = Modifier.fillMaxWidth())
            SettingsListItem(R.drawable.account_stroke_icon, "Manage my account")
            SettingsListItem(R.drawable.lock_stroke_icon, "Privacy and safety")
            SettingsListItem(R.drawable.camera_stroke_icon, "Content preferences")
            SettingsListItem(R.drawable.wallet_stroke_icon, "Balance")
            SettingsListItem(R.drawable.share_icon, "Share profile")
            SettingsListItem(R.drawable.qr_code_icon, "TikCode")

            Spacer(
                Modifier
                    .border(0.5.dp, DivideColor)
                    .fillMaxWidth()
                    .height(1.dp)
            )

            Spacer(Modifier.height(20.dp))

            Text("GENERAL", style = Typography.titleSmall, modifier = Modifier.fillMaxWidth())
            SettingsListItem(R.drawable.bell_icon, "Push notifications")
            SettingsListItem(R.drawable.book_stroke_icon, "Language")
            SettingsListItem(R.drawable.umbrella_stroke_icon, "Digital Wellbeing")
            SettingsListItem(R.drawable.accebility_stroke_icon, "Accessibility")
            SettingsListItem(R.drawable.drop_stroke_icon, "Data Saver")

            Spacer(
                Modifier
                    .border(0.5.dp, DivideColor)
                    .fillMaxWidth()
                    .height(1.dp)
            )

            Spacer(Modifier.height(20.dp))

            Text("SUPPORT", style = Typography.titleSmall, modifier = Modifier.fillMaxWidth())
            SettingsListItem(R.drawable.pen_stroke_icon, "Report a problem")
            SettingsListItem(R.drawable.question_stroke_icon, "Help Center")

        }
    }
}