package com.yuwin.snapsyn.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Immutable
data class CustomTypography(
    val body: TextStyle = TextStyle(
        fontSize = 16.sp,
        letterSpacing = 1.5.sp,
        lineHeight = 10.sp
    )
)

internal val LocalTypography = staticCompositionLocalOf { CustomTypography() }