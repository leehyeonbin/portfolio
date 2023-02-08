package ui.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.white
import org.jetbrains.compose.web.dom.Div
import ui.util.NotoNomalText

@Composable
fun ClockComponent(time: String) {
    Div(attrs = {
        style {
            fontSize(0.8.em)
            color(white)
            position(Position.Absolute)
        }
    }) {
        NotoNomalText(time)
    }
}