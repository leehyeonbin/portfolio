package screen.phone.display

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import screen.phone.display.app.AppIconData

@Composable
fun BackgroundApps() {
    Div(attrs = {
        style {
            display(DisplayStyle.Grid)
            gridTemplateColumns("repeat(4, 1fr) ")
            gridTemplateRows("repeat(4, 1fr) ")
            width(100.percent)
            height(80.percent)
        }
    }) {
        val appList = listOf(
            AppIconData(appName = "", image = ""),
            AppIconData(appName = "", image = ""),
            AppIconData(appName = "", image = ""),
            AppIconData(appName = "", image = ""),
            AppIconData(appName = "", image = ""),
            AppIconData(appName = "", image = ""),
            AppIconData(appName = "", image = "")
        )
    }
}