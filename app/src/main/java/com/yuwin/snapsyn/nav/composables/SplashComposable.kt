package com.yuwin.snapsyn.nav.composables

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.yuwin.snapsyn.nav.Screen
import com.yuwin.snapsyn.ui.screens.splash.SplashScreen


fun NavGraphBuilder.splashComposable(navController: NavController) {

    composable(Screen.SPLASH.route) {
        SplashScreen {
            navController.navigate(Screen.HOME.route) {
                popUpTo(Screen.SPLASH.route) { inclusive = true }
            }
        }
    }

}