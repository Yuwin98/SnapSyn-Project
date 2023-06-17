package com.yuwin.snapsyn.ui.screens.home.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R
import com.yuwin.snapsyn.app.components.SectionTitle
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun PrimaryActions() {

    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 24.dp)
            .fillMaxWidth()
    ) {
        Column {
            SectionTitle(title = "CREATE NEW", isActionAvailable = false)
            Spacer(modifier = Modifier.height(8.dp))
            PrimaryButtonRow()
        }
    }
}

@Composable
fun PrimaryButtonRow(
    onFirst: () -> Unit = {},
    onSecond: () -> Unit = {},
    onThird: () -> Unit = {},
) {

    val gradient = Brush.verticalGradient(
        listOf(
            SnapSyn.colors.secondary.copy(alpha = 0.2f),
            SnapSyn.colors.primary.copy(alpha = 0.2f)
        )
    )
    val buttonShape = RoundedCornerShape(16.dp)
    val configuration = LocalConfiguration.current

    val screenWidth = configuration.screenWidthDp
    val margin = 32.dp
    val buttonSpacing = 16.dp

    val buttonSize = (screenWidth.dp - margin - buttonSpacing).div(3)

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {

        PrimaryButton(
            title = "VIDEO", icon = R.drawable.video,
            contentDescription = "Create Video",
            modifier = Modifier
                .size(buttonSize)
                .clip(buttonShape)
                .border(
                    width = 1.dp, brush = gradient,
                    shape = buttonShape
                ),
            onClick = onFirst
        )

        PrimaryButton(
            title = "IMAGE", icon = R.drawable.image,
            contentDescription = "Create Image",
            modifier = Modifier
                .clip(buttonShape)
                .size(buttonSize)
                .border(
                    width = 1.dp, brush = gradient,
                    shape = buttonShape
                ),
            onClick = onSecond
        )

        PrimaryButton(
            title = "COLLAGE", icon = R.drawable.collage,
            contentDescription = "Create Collage",
            modifier = Modifier
                .size(buttonSize)
                .clip(buttonShape)
                .border(
                    width = 1.dp, brush = gradient,
                    shape = buttonShape
                ),
            onClick = onThird
        )

    }

}