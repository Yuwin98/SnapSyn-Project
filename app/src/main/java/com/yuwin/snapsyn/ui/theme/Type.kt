package com.yuwin.snapsyn.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.yuwin.snapsyn.R


val Roboto = FontFamily(
    Font(R.font.roboto_thin, FontWeight.Thin),
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold),
)

val RobotoFlex = FontFamily(
    Font(R.font.roboto_flex_regular, FontWeight.Normal)
)

@Immutable
data class CustomTypography(
    val h1: TextStyle = TextStyle(
        fontFamily = Roboto,
        fontSize = 48.sp
    ),
    val h2: TextStyle = TextStyle(
        fontFamily = Roboto,
        fontSize = 34.sp
    ),
    val h3: TextStyle = TextStyle(
        fontFamily = Roboto,
        fontSize = 24.sp
    ),
    val h4: TextStyle = TextStyle(
        fontFamily = Roboto,
        fontSize = 16.sp
    ),
    val h5: TextStyle = TextStyle(
        fontFamily = Roboto,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    val subtitle1: TextStyle = TextStyle(
        fontFamily = RobotoFlex,
        fontSize = 16.sp
    ),
    val subtitle2: TextStyle = TextStyle(
        fontFamily = RobotoFlex,
        fontSize = 14.sp
    ),
    val button: TextStyle = TextStyle(
        fontFamily = RobotoFlex,
        fontSize = 14.sp,
        lineHeight = 2.sp
    ),
    val caption: TextStyle = TextStyle(
        fontFamily = RobotoFlex,
        fontSize = 12.sp
    ),
    val overline: TextStyle = TextStyle(
        fontFamily = RobotoFlex,
        fontSize = 10.sp
    ),

)

internal val LocalTypography = staticCompositionLocalOf { CustomTypography() }