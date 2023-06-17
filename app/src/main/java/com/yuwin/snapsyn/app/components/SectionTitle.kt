package com.yuwin.snapsyn.app.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R
import com.yuwin.snapsyn.ui.theme.SnapSyn
import java.util.Locale

@Composable
fun SectionTitle(title: String, isActionAvailable: Boolean, onClick: () -> Unit ={}) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = title.uppercase(Locale.ROOT),
                style = SnapSyn.typography.h5,
                color = Color.White
            )

            if (isActionAvailable) {
                IconButton(
                    modifier = Modifier.size(24.dp),
                    icon = R.drawable.chevron_right,
                    contentDescription = "Show More Button",
                    onClick = onClick
                )
            }
        }

    }

}