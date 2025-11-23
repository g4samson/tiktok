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
    Font(R.font.black, FontWeight.Black),
    Font(R.font.bold, FontWeight.Bold),
    Font(R.font.semi_bold, FontWeight.SemiBold),
    Font(R.font.medium, FontWeight.Medium),
    Font(R.font.regular, FontWeight.Normal),
    Font(R.font.light, FontWeight.Light),

)

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Bold,
        fontSize = 17.sp,
        lineHeight = 17.sp,
        letterSpacing = 0.sp, color = TikTokDark, textAlign = TextAlign.Center
    ),

)