package com.yuwin.snapsyn.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R
import com.yuwin.snapsyn.app.components.IconButton
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun HomeTopBar() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(SnapSyn.colors.status_bar)
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.text_logo),
                contentDescription = "Text Logo",
                colorFilter = ColorFilter.tint(color = SnapSyn.colors.iconPrimary),
                modifier = Modifier
                    .size(width = 130.dp, height = 52.dp)
            )

            HomeIcons(onSettings = { }, onRate = { }) {}
        }

    }

}

@Composable
fun HomeIcons(
    onSettings: () -> Unit,
    onRate: () -> Unit,
    onPremium: () -> Unit
) {
    Row {
        IconButton(
            modifier = Modifier,
            icon = R.drawable.star,
            contentDescription = "Rate Us",
            onClick = onRate
        )

        IconButton(
            modifier = Modifier,
            icon = R.drawable.crown,
            contentDescription = "Go Premium",
            onClick = onPremium
        )

        IconButton(
            modifier = Modifier,
            icon = R.drawable.settings,
            contentDescription = "Settings",
            onClick = onSettings
        )
    }
}

@Preview
@Composable
fun HomePreview() {
    HomeTopBar()
}