package ui.component

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.StyleBuilder

// Border.kt
fun StyleBuilder.borderTop(width: CSSNumeric, lineStyle: LineStyle, color: CSSColorValue) {
    property("border-top", "$width $lineStyle $color")
}

fun StyleBuilder.borderRight(width: CSSNumeric, lineStyle: LineStyle, color: CSSColorValue) {
    property("border-right", "$width $lineStyle $color")
}

fun StyleBuilder.borderBottom(width: CSSNumeric, lineStyle: LineStyle, color: CSSColorValue) {
    property("border-bottom", "$width $lineStyle $color")
}

fun StyleBuilder.borderLeft(width: CSSNumeric, lineStyle: LineStyle, color: CSSColorValue) {
    property("border-left", "$width $lineStyle $color")
}