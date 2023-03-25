package ui.style

import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.backgroundColor

object BodyStyleSheet : StyleSheet() {
    init {
        "body" style {
            backgroundColor(Color.black)
        }
    }
}