/*
 *abiola 2024
 */

package com.mshdabiola.designsystem

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.HyaTopAppBar
import com.mshdabiola.designsystem.icon.HyaIcons
import com.mshdabiola.testing.util.CaptureMultiTheme

class TopAppBarScreenshotTests() {

    @Preview
    @Composable
    fun TopAppBar() {
        CaptureMultiTheme {
            HyaTopAppBarExample()
        }
    }

    @Preview(fontScale = 2.0f)
    @Composable
    fun TopAppBarHumFontScale2() {
        CaptureMultiTheme {
            HyaTopAppBarExample()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun HyaTopAppBarExample() {
        HyaTopAppBar(
            titleRes = "untitled",
            navigationIcon = HyaIcons.Search,
            navigationIconContentDescription = "Navigation icon",
            actionIcon = HyaIcons.MoreVert,
            actionIconContentDescription = "Action icon",
        )
    }
}
