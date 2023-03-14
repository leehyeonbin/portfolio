package screen.main

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun MainScreen() {
    Div(
        attrs = {
            style {
                position(Position.Absolute)
                width(100.percent)
                height(100.percent)
                left(0.px)
                top(0.px)
                backgroundColor(Color.blue)
            }
        }
    ){

    }
}