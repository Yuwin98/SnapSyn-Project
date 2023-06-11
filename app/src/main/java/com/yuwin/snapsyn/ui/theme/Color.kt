package com.yuwin.snapsyn.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColors(
    val primary: Color,
    val secondary: Color,
    val background: Color,
    val backgroundSecondary: Color,
    val systemBars: Color,
    val ripple: Color,
    val text_home: Color,
)

val customColors = CustomColors(
    primary = Color(0xFFFF005C),
    secondary = Color(0xFFFF9171),
    systemBars = Color(0xFF010101),
    background = Color(0xFF1B1B1B),
    backgroundSecondary = Color(0xFF2B2B2B),
    ripple = Color(0xFF4C4C4C),
    text_home = Color(0xFF717171)
)

internal val LocalColors = staticCompositionLocalOf { customColors }