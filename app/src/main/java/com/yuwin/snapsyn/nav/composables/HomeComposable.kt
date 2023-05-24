package com.yuwin.snapsyn.nav.composables

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yuwin.snapsyn.nav.Screen
import com.yuwin.snapsyn.ui.screens.home.HomeScreen

fun NavGraphBuilder.homeComposable() {

    composable(Screen.HOME.route) {
        HomeScreen()
    }

}