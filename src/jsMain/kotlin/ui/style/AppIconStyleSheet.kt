package ui.style

import org.jetbrains.compose.web.css.*

object AppIconStyleSheet: StyleSheet() {
    val container by style {
        textAlign("center")
        lineHeight(0.px)
        hover{
            backgroundColor(Color.red)
        }
    }
}