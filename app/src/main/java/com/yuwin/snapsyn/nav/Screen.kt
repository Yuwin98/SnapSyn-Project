package com.yuwin.snapsyn.nav

sealed class Screen(val route: String) {
    object HOME: Screen("home")
    object SPLASH: Screen("splash")
}
