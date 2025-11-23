package com.profs.tiktok.data.utils

import com.profs.tiktok.data.models.Constants
import com.profs.tiktok.data.models.ImageUser

class Module {

    fun getUserImage(): List<ImageUser> {
        return Constants.imagesUser
    }
}