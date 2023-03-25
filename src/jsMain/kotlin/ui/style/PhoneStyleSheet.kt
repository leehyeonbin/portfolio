package ui.style

import org.jetbrains.compose.web.css.*

object PhoneStyleSheet : StyleSheet() {
    val animation by keyframes {
        from {
            property("transform", "translateY(-30%)")
        }

        to {
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