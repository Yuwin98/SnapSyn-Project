package com.yuwin.snapsyn.nav

sealed class Screen(val route: String) {
    object HOME: Screen("home")
    object PERMISSION: Screen("permission")
    object GALLERY: Screen("gallery")
    object IMAGE_EDITOR: Screen("image_editor")
    object SPLASH: Screen("splash")
    object FAVOURITES: Screen("favourites")
    object STORE: Screen("store")
    object PROJECTS: Screen("projects")
    object PREMIUM: Screen("premium")
    object SETTINGS: Screen("settings")
}
