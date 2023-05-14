package com.yuwin.snapsyn.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColors(
    val primary: Color,
    val secondary: Color,
    val accent: Color
)

val lightColors = CustomColors(
    primary = Color(0xFFEF476F),
    secondary = Color(0xFF06D6A0),
    accent = Color(0xFFFFD166)
)

val darkColors = CustomColors(
    primary = Color(0xFFEF476F),
    secondary = Color(0xFF06D6A0),
    accent = Color(0xFFFFD166)
)

internal val LocalColors = staticCompositionLocalOf { lightColors }