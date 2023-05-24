package com.yuwin.snapsyn.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val currentColors = remember { if(darkTheme) darkColors else lightColors }

    val systemUiController = rememberSystemUiController()

    DisposableEffect(systemUiController) {

        systemUiController.setSystemBarsColor(
            color = currentColors.background,
            darkIcons = false
        )

        onDispose {  }
    }


    CompositionLocalProvider(
        LocalColors provides currentColors,
        LocalTypography provides CustomTypography(),
        content = content
    )

}

object SnapSyn {
    val colors: CustomColors
        @Composable
        get() = LocalColors.current

    val typography: CustomTypography
        @Composable
        get() = LocalTypography.current
}