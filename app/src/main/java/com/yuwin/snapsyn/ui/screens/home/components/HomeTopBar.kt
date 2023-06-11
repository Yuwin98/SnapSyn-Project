package com.yuwin.snapsyn.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R
import com.yuwin.snapsyn.app.components.IconButton
import com.yuwin.snapsyn.app.components.IconPillButton
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun HomeTopBar() {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 16.dp)
            .fillMaxWidth()
            .height(56.dp)
//            .background(Color.Gray)
    ) {
        Image(
            painter = painterResource(id = R.drawable.snapsyn_text_logo),
            contentDescription = "App Text Logo"
        )

        HomeIconBar()
    }

}

@Composable
fun HomeIconBar() {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .width(161.dp)
            .height(36.dp)
    ) {
        IconButton(
            icon = R.drawable.crown,
            contentDescription = "Get Premium Subscription",
            modifier = Modifier
                .clip(CircleShape)
                .size(36.dp)
                .background(
                    brush =
                    Brush.verticalGradient(
                        listOf(
                            SnapSyn.colors.secondary,
                            SnapSyn.colors.primary
                        )
                    ),
                    alpha = 0.2f
                )
        ) {

        }

        Spacer(modifier = Modifier.width(10.dp))

        IconPillButton(
            icon = R.drawable.star,
            contentDescription = "Rate Our App",
            modifier = Modifier
        ) {

        }

        Spacer(modifier = Modifier.width(10.dp))

        IconButton(
            icon = R.drawable.settings,
            contentDescription = "Get Premium Subscription",
            modifier = Modifier
                .clip(CircleShape)
                .size(32.dp)
        ) {

        }

    }

}


@Preview
@Composable
fun HomePreview() {
    HomeTopBar()
}