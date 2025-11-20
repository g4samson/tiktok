package com.profs.tiktok.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.profs.tiktok.R

val Inter = FontFamily(
    Font(R.font.inter_black, FontWeight.Black),
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_light, FontWeight.Light),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_semibold, FontWeight.SemiBold),

)

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp, color = DefaultWhite, textAlign = TextAlign.Center
    ),
    titleMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Bold,
        fontSize = 17.sp,
        lineHeight = 17.sp,
        letterSpacing = 0.sp, color = Dark, textAlign = TextAlign.Center
    ),
    titleSmall = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 13.sp,
        lineHeight = 13.sp,
        letterSpacing = 0.sp, color = TextColor
    ),
    bodyMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        textAlign = TextAlign.Center,
        lineHeight = 14.sp, color = LightTextColor
    )

)