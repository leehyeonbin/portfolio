package screen.phone.display.bluetooth

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import ui.style.BlueToothStyleSheet

@Composable
fun BlueToothModal() {
    Style(BlueToothStyleSheet)
    Div(attrs = {
        classes(BlueToothStyleSheet.container)
    }) {
        Div(attrs = {
            style {
                position(Position.Absolute)
                width(100.percent - 50.px)
                height(100.percent - 70.px)
            }
        }) {
            Div(attrs = {
                style {
                    position(Position.Absolute)
                    width(100.percent)
                    textAlign("left")
                }
            }) {
                Text("Github")
            }
            Div(attrs = {
                style {
                    width(100.percent)
                }
            }) {

            }
            Div {

            }
        }
    }
}