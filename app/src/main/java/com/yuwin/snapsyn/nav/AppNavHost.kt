package com.yuwin.snapsyn.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.yuwin.snapsyn.nav.composables.homeComposable

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: Screen = Screen.HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination.route
    ) {
        homeComposable()
    }

}