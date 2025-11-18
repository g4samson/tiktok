package com.profs.tiktok.presentation.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.profs.tiktok.R
import com.profs.tiktok.presentation.theme.Dark
import com.profs.tiktok.presentation.theme.TextColor
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun SettingsListItem(icon: Int, title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth().clickable{  }
            .height(50.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(16.dp),
                tint = TextColor
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(title, style = Typography.bodyMedium.copy(color = Dark, fontSize = 15.sp))
        }

        Icon(
            painterResource(R.drawable.icon_go),
            contentDescription = null,
            modifier = Modifier.size(10.dp),
            tint = TextColor
        )
    }
}

@Composable
fun FriendsListItem(icon: Int, title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth().clickable{  }
            .height(76.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(56.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(title, style = Typography.bodyMedium.copy(color = Dark, fontSize = 15.sp))
        }

        Icon(
            painterResource(R.drawable.icon_go),
            contentDescription = null,
            modifier = Modifier.size(10.dp),
            tint = TextColor
        )
    }
}