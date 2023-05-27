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
    val titleBarBackground: Color,
    val gradient_start: Color,
    val gradient_end: Color,
    val status_bar: Color,
    val ripple: Color,
    val white: Color,
    val onSurface: Color,
    val iconPrimary: Color
)

val lightColors = CustomColors(
    primary = Color(0xFFEF476F),
    secondary = Color(0xFF06D6A0),
    accent = Color(0xFFFFD166),
    background = Color(0xFFFCFCFC),
    titleBarBackground = Color(0xFFF2F2F2),
    gradient_start = Color(0xFFFF9171),
    gradient_end = Color(0xFFFF005C),
    status_bar = Color(0xFF0A0502),
    ripple = Color(0xFF222222),
    white = Color(0xFFFFFFFF),
    onSurface = Color(0xFF222222),
    iconPrimary = Color(0xFF2C2C2C)
)

val darkColors = CustomColors(
    primary = Color(0xFFEF476F),
    secondary = Color(0xFF06D6A0),
    accent = Color(0xFFFFD166),
    background = Color(0xFF222222),
    titleBarBackground = Color(0xFF0A0502),
    gradient_start = Color(0xFFFF9171),
    gradient_end = Color(0xFFFF005C),
    status_bar = Color(0xFF0A0502),
    ripple = Color(0xFFFCFCFC),
    white = Color(0xFFFFFFFF),
    onSurface = Color(0xFFFCFCFC),
    iconPrimary = Color(0xFFFCFCFC)
)

internal val LocalColors = staticCompositionLocalOf { lightColors }