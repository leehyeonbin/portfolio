package ui.style

import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.lineHeight
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textAlign

object AppIconStyleSheet : StyleSheet() {
    val container by style {
        textAlign("center")
        lineHeight(0.px)
        property("filter", "brightness(1)")
        hover {
            property("filter", "brightness(0.8)")
        }
    }
}