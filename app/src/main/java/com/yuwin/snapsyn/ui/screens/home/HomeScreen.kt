package com.yuwin.snapsyn.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yuwin.snapsyn.R
import com.yuwin.snapsyn.app.components.SectionTitle
import com.yuwin.snapsyn.ui.screens.home.components.EmptyState
import com.yuwin.snapsyn.ui.screens.home.components.HomeTopBar
import com.yuwin.snapsyn.ui.theme.SnapSyn

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .displayCutoutPadding()
            .navigationBarsPadding()
            .fillMaxSize()
            .background(color = SnapSyn.colors.background)
    ) {
        HomeTopBar()

        Spacer(modifier = Modifier.weight(1f))

        EmptyState(
            stateText = "NO PROJECTS",
            illustration = R.drawable.empty_state,
            modifier = Modifier.fillMaxWidth()
        )

        SectionTitle(title = "CREATE NEW", isActionAvailable = true) {

        }

        Spacer(modifier = Modifier.weight(1f))

    }
}