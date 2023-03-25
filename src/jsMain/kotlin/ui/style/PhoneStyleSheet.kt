package ui.style

import org.jetbrains.compose.web.css.*

object PhoneStyleSheet : StyleSheet() {
    private val animation by keyframes {
        from {
            opacity(0.6)
            property("transform", "translateY(-30%)")
        }
        to {
        opacity(1)
            property("transform", "translateY(0%)")
        }
    }
    val container by style {
        textAlign("center")
        lineHeight(0.px)
        position(Position.Absolute)
        right(0.px)
        animation(animation) {
            duration(1.s)
            timingFunction(AnimationTimingFunction.Ease)
        }
    }
}