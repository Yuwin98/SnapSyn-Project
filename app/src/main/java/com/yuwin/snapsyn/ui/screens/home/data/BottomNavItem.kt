package com.yuwin.snapsyn.ui.screens.home.data

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R

data class BottomNavItem(
    val icon: Int,
    val iconSize: Dp = 24.dp,
    val name: String
)

val bottomNavItems = listOf(
    BottomNavItem(
        icon = R.drawable.home,
        name = "Home"
    ),
    BottomNavItem(
        icon = R.drawable.heart,
        name = "Favourites"
    ),
    BottomNavItem(
        icon = R.drawable.plus,
        iconSize = 18.dp,
        name = "Create"
    ),
    BottomNavItem(
        icon = R.drawable.shop,
        name = "Shop"
    ),
    BottomNavItem(
        icon = R.drawable.document,
        name = "Projects"
    )
)