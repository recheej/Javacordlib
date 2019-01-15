package com.github.recheej.extensions

import org.javacord.api.entity.user.UserStatus

fun UserStatus.isOnline() = this == UserStatus.ONLINE