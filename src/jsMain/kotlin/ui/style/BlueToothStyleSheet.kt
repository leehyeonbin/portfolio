package ui.style

import org.jetbrains.compose.web.css.*

object BlueToothStyleSheet : StyleSheet() {
    private val animation by keyframes {
        from {
            property("transform", "translateY(20%)")
        }
        to {
            property("transform", "translateY(0%)")
        }
    }
    val container by style {
        position(Position.Absolute)
        width(100.percent - 20.px)
        textAlign("center")
        height(35.percent)
        borderRadius(25.px)
        bottom(30.px)
        backgroundColor(Color.white)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        display(DisplayStyle.Flex)
        animation(animation) {
            delay(2.s)
            duration(0.4.s)
            timingFunction(AnimationTimingFunction.Ease)
        }
        property("z-index", "1")
    }
}