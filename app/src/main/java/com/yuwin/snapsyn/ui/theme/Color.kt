package com.yuwin.snapsyn.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColors(
    val primary: Color,
    val secondary: Color,
    val accent: Color,
    val background: Color,
    val gradient_start: Color,
    val gradient_end: Color,
    val status_bar: Color,
    val white: Color
)

val lightColors = CustomColors(
    primary = Color(0xFFEF476F),
    secondary = Color(0xFF06D6A0),
    accent = Color(0xFFFFD166),
    background = Color(0xFF222222),
    gradient_start = Color(0xFFFF9171),
    gradient_end = Color(0xFFFF005C),
    status_bar = Color(0xFF0A0502),
    white = Color(0xFFFFFFFF)
)

val darkColors = CustomColors(
    primary = Color(0xFFEF476F),
    secondary = Color(0xFF06D6A0),
    accent = Color(0xFFFFD166),
    background = Color(0xFF222222),
    gradient_start = Color(0xFFFF9171),
    gradient_end = Color(0xFFFF005C),
    status_bar = Color(0xFF0A0502),
    white = Color(0xFFFFFFFF)
)

internal val LocalColors = staticCompositionLocalOf { lightColors }