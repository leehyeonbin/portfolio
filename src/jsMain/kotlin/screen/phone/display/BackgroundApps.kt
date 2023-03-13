package screen.phone.display

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import screen.phone.display.app.AppIconData
import ui.component.Apps

@Composable
fun BackgroundApps() {
    Div(attrs = {
        style {
            display(DisplayStyle.Grid)
            gridTemplateColumns("repeat(5, 1fr) ")
            gridTemplateRows("repeat(6, 1fr) ")
            width(100.percent)
            height(80.percent)
            paddingTop(75.px)
        }
    }) {
        val appList = listOf(
            AppIconData(appName = "GCMS", image = "image/ic_gcms.svg"),
            AppIconData(appName = "AiD", image = "./image/ic_aid.svg"),
            AppIconData(appName = "Quicket", image = "./image/ic_quicket.svg"),
            AppIconData(appName = "MOIZA", image = "./image/ic_moiza.png"),
            AppIconData(appName = "영월", image = "./image/ic_youngwol.svg")
        )

        appList.forEach {
            Apps(it)
        }
    }
}