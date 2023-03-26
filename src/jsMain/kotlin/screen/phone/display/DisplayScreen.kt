package screen.phone.display

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import screen.phone.device.StatusBar
import screen.phone.display.app.BottomApps
import screen.phone.display.bluetooth.BlueToothModal
import ui.component.Camera

@Composable
fun DisplayScreen() {
    Div(attrs = {
        style {
            borderRadius(37.px)
            width(100.percent - 4.px)
            height(100.percent - 4.px)
            border {
                width = 2.px
                color = rgb(r = 74, g = 75, b = 77)
                style = LineStyle.Solid
            }
        }
    }) {
        val backgroundImage =
            "https://r1.community.samsung.com/t5/image/serverpage/image-id/6154775i034DD4C88767F1B5/image-dimensions/2500?v=v2&px=-1"
        Div(attrs = {
            style {
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                marginLeft(2.px)
                marginTop(2.px)
                borderRadius(40.px)
                width(100.percent - 4.px)
                height(100.percent - 4.px)
                backgroundImage("url($backgroundImage)")
                backgroundPosition("center")
                backgroundSize("cover")
                position(Position.Relative)
                textAlign("center")
            }
        }) {
            StatusBar()
            Camera()
            BackgroundApps()
            BlueToothModal()
            BottomApps()
        }
    }
}