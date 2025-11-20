package com.profs.tiktok.presentation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.profs.tiktok.R
import com.profs.tiktok.presentation.theme.Dark
import com.profs.tiktok.presentation.theme.DarkerBlakc
import com.profs.tiktok.presentation.theme.LightTextColor
import com.profs.tiktok.presentation.theme.TextColor
import com.profs.tiktok.presentation.theme.Typography

@Composable
fun SettingsListItem(icon: Int, title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { }
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
            .fillMaxWidth()
            .clickable { }
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

@Composable
fun CommentsListItem(
    image: Int,
    name: String,
    desc: String,
    hours: String,
    replies: String,
    likes: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row {
            Image(
                painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(32.dp),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    name,
                    style = Typography.bodyMedium.copy(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold, color = LightTextColor
                    )
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    buildAnnotatedString {
                        withStyle(SpanStyle(fontSize = 15.sp, color = Dark)) {
                            append("${desc} ")
                        }
                        withStyle(SpanStyle(fontSize = 13.sp, color = LightTextColor)) {
                            append(hours)
                        }
                    },
                    fontWeight = FontWeight.Normal
                )

                Spacer(modifier = Modifier.height(10.dp))

                if (replies.isNotEmpty()) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "View replies (${replies})",
                            style = Typography.bodyMedium.copy(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.SemiBold, color = LightTextColor
                            )
                        )

                        Spacer(modifier = Modifier.width(4.dp))

                        Icon(
                            painterResource(R.drawable.icon_replies),
                            contentDescription = null,
                            tint = LightTextColor,
                            modifier = Modifier.size(9.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 12.dp)
        ) {
            Icon(
                painterResource(R.drawable.heart_stroke_icon),
                contentDescription = null,
                tint = LightTextColor,
                modifier = Modifier.size(15.dp)
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                likes,
                style = Typography.bodyMedium.copy(
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Normal, color = LightTextColor
                )
            )
        }
    }
}

@Composable
fun SharesListItem(icon: Int, title: String) {
    Column(modifier = Modifier.width(60.dp).clickable{}, horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painterResource(icon),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(45.dp)
        )
        Spacer(Modifier.height(8.dp))
        Text(title, style = Typography.titleMedium.copy(
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp, color = DarkerBlakc
        ))
    }

}