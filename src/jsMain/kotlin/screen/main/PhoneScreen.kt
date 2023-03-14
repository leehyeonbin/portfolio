package screen.main

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import screen.phone.Phone

@Composable
fun PhoneScreen() {
    Div(
        attrs = {
            style {
                width(80.percent)
                height(100.vh)
                left(10.percent)
                position(Position.Relative)
            }
        }
    ) {
        Phone()
    }
}