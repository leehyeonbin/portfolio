package ui.style

import org.jetbrains.compose.web.css.*

object AppIconStyleSheet: StyleSheet() {
    val container by style {
        textAlign("center")
        lineHeight(0.px)
        property("filter", "brightness(1)")
        property("transition", "5s")
        hover {
            property("filter", "brightness(0.8)")
            backgroundColor(Color.red)
        }
    }
}