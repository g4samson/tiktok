package com.profs.tiktok.data.models

import com.profs.tiktok.R

object Constants {

    val imagesUser = listOf<ImageUser>(
        ImageUser(R.drawable.a1),
        ImageUser(R.drawable.a2),
        ImageUser(R.drawable.a3),
        ImageUser(R.drawable.a4),

    )
}

data class ImageUser(
    val image: Int
)