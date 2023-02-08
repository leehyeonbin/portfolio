package ui.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Color.white
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun ClockComponent(time: String) {
    Div(attrs = {
        style {
            fontSize(0.8.em)
            color(white)
        }
    }) {
        Text(time)
    }
}