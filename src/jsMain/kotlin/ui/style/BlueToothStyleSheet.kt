package ui.style

import org.jetbrains.compose.web.css.*

object BlueToothStyleSheet : StyleSheet() {
    val container by style {
        position(Position.Absolute)
        width(100.percent - 30.px)
        textAlign("center")
        height(35.percent)
        borderRadius(10.px)
        bottom(30.px)
        backgroundColor(Color.white)
        property("z-index", "1")
    }
}