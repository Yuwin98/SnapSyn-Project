package com.yuwin.snapsyn.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColors(
    val primary: Color
)

val lightColors = CustomColors(
    primary = Color(0xFFFF005C)
)

val darkColors = CustomColors(
    primary = Color(0xFF00FF5C)
)

internal val LocalColors = staticCompositionLocalOf { lightColors }