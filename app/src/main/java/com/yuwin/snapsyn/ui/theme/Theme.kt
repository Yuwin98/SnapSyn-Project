package com.yuwin.snapsyn.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val currentColors = remember { customColors }

    val systemUiController = rememberSystemUiController()

    DisposableEffect(systemUiController, darkTheme) {

        systemUiController.setStatusBarColor(
            color = currentColors.systemBars,
            darkIcons = false
        )

        systemUiController.setNavigationBarColor(
            color = currentColors.systemBars,
            darkIcons = false
        )

        onDispose { }
    }


    CompositionLocalProvider(
        LocalRippleTheme provides SnapsynRippleTheme,
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

@Immutable
private object SnapsynRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = RippleTheme.defaultRippleColor(
        contentColor = SnapSyn.colors.ripple,
        lightTheme = !isSystemInDarkTheme()
    )

    @Composable
    override fun rippleAlpha() = RippleTheme.defaultRippleAlpha(
        contentColor = SnapSyn.colors.ripple,
        lightTheme = !isSystemInDarkTheme()
    )
}