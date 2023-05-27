package com.yuwin.snapsyn.ui.screens.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.app.components.TitleBar
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun HomeTopBar() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {

        TitleBar(
            title = "Home",
            titleAlignment = TextAlign.Left,
            iconColor = SnapSyn.colors.white,
            titleColor = SnapSyn.colors.white
        ) {

        }

    }


}

@Preview
@Composable
fun HomePreview() {
    HomeTopBar()
}