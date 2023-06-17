package com.yuwin.snapsyn.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.ui.screens.home.data.BottomNavItem
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun NavBarItem(
    bottomNavItem: BottomNavItem,
    isSelected: Boolean,
    isPrimary: Boolean,
    enabled: Boolean = true,
    bounded: Boolean = true,
    activeColor: Color = Color.White,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit = {},
    modifier: Modifier
) {
    Box(
        modifier = modifier
            .clickable(
                onClick = onClick,
                enabled = enabled,
                role = Role.Button,
                interactionSource = interactionSource,
                indication = rememberRipple(
                    bounded = bounded
                )
            )

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = if (isPrimary) 0.dp else 8.dp).fillMaxSize()
        ) {
            Icon(
                painter = painterResource(id = bottomNavItem.icon),
                contentDescription = bottomNavItem.name,
                tint = if(isSelected || isPrimary) activeColor else Color.White.copy(alpha = 0.3f),
                modifier = Modifier.size(bottomNavItem.iconSize)
            )
            if (!isPrimary) {
                Spacer(modifier = Modifier.height(4.dp))
                SelectedItemIndicator(isSelected)
            }

        }
    }
}

@Composable
fun SelectedItemIndicator(isSelected: Boolean) {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .size(4.dp)
            .background(if (isSelected) Color.White else Color.Transparent)
    )
}