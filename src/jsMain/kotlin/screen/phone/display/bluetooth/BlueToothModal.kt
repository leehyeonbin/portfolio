package screen.phone.display.bluetooth

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import ui.style.BlueToothStyleSheet

@Composable
fun BlueToothModal() {
    Style(BlueToothStyleSheet)
    Div(attrs = {
        classes(BlueToothStyleSheet.container)
    }) {

        Text("asdasdfadfasdfasdff")
    }
}