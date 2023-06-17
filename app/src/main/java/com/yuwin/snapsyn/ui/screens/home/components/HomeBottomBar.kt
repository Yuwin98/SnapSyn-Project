package com.yuwin.snapsyn.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R
import com.yuwin.snapsyn.app.components.IconButton
import com.yuwin.snapsyn.ui.screens.home.data.bottomNavItems
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun HomeBottomBar() {

    var selectedItem by remember { mutableStateOf(0) }
    val gradient = Brush.verticalGradient(
        listOf(
            SnapSyn.colors.secondary,
            SnapSyn.colors.primary
        )
    )
    val navBarPrimaryButton = Modifier
        .clip(CircleShape)
        .size(40.dp)
        .background(brush = gradient)

    val navBarButton = Modifier
//        .clip(CircleShape)
        .size(52.dp)


    Box(
        modifier = Modifier
            .padding(start = 26.5.dp, end = 26.5.dp, bottom = 16.dp)
            .clip(RoundedCornerShape(80))
            .fillMaxWidth()
            .height(52.dp)
            .background(SnapSyn.colors.backgroundSecondary)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxSize()
        ) {
            bottomNavItems.forEachIndexed { index, bottomNavItem ->
                NavBarItem(
                    bottomNavItem = bottomNavItem,
                    isSelected = index == selectedItem,
                    isPrimary = bottomNavItem.icon == R.drawable.plus,
                    modifier = if (bottomNavItem.icon == R.drawable.plus) navBarPrimaryButton else navBarButton,
                    onClick = {
                        selectedItem = index
                    }
                )
            }
        }
    }

}