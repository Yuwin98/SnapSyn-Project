package com.yuwin.snapsyn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.yuwin.snapsyn.ui.theme.AppTheme
import com.yuwin.snapsyn.ui.theme.SnapSyn

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(
                    color = SnapSyn.colors.primary,
                    modifier = Modifier.fillMaxSize()
                ) {

                }
            }
        }
    }
}

