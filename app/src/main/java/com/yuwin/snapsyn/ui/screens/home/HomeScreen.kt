package com.yuwin.snapsyn.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R
import com.yuwin.snapsyn.ui.screens.home.components.HomeTopBar
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun HomeScreen() {

    Box(
        modifier = Modifier
            .displayCutoutPadding()
            .navigationBarsPadding()
            .fillMaxSize()
            .background(color = SnapSyn.colors.background)
    ) {

//        Icon(
//            painter = painterResource(id = R.drawable.snapsyn_text_logo),
//            contentDescription = "Text Logo",
//            tint = SnapSyn.colors.white,
//            modifier = Modifier.size(width = 150.dp, height = 60.dp)
//        )
        HomeTopBar()

    }
}