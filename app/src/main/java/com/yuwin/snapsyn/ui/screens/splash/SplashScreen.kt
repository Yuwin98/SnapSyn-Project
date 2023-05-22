package com.yuwin.snapsyn.ui.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun SplashScreen(
    navToHome: () -> Unit
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(SnapSyn.colors.primary)
            .fillMaxSize(),
    ) {
        Box {
            Text(
                text = "SPLASH",
                style = SnapSyn.typography.body,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.Center)
                    .clickable(enabled = true, onClick = navToHome)
            )
        }

    }
}