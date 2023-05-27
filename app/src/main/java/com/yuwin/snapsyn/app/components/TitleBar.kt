package com.yuwin.snapsyn.app.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun TitleBar(
    title: String,
    titleAlignment: TextAlign = TextAlign.Center,
    titleColor: Color,
    backgroundColor: Color = SnapSyn.colors.secondary,
    iconColor: Color,
    onBack: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(backgroundColor)
    ) {

//        IconButton(
//            onClick = onBack,
//            modifier = Modifier.size(48.dp)
//        ) {
//            Icon(
//                painter = painterResource(id = R.drawable.arrow_left),
//                contentDescription = "Arrow Left",
//                tint = iconColor,
//                modifier = Modifier.size(size = 24.dp)
//            )
//        }


        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {

            IconButton(
                icon = R.drawable.arrow_left,
                contentDescription = "Back Button",
                modifier = Modifier.padding(start = 4.dp)
            ) {

            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = title,
                style = SnapSyn.typography.title,
                textAlign = titleAlignment,
                color = titleColor,
                modifier = Modifier
                    .padding(start = if (titleAlignment == TextAlign.Left) 72.dp else 0.dp)
                    .fillMaxWidth()
            )
        }


    }
}

@Preview
@Composable
fun TopBarPreview() {
    TitleBar(
        title = "Settings",
        iconColor = SnapSyn.colors.white,
        titleColor = SnapSyn.colors.white,
        onBack = {}
    )
}