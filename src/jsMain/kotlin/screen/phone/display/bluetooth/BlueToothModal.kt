package screen.phone.display.bluetooth

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.B
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import ui.style.BlueToothStyleSheet

@Composable
fun BlueToothModal() {
    Style(BlueToothStyleSheet)
    Div(attrs = {
        classes(BlueToothStyleSheet.container)
    }) {
        Div(attrs = {
            style {
                position(Position.Absolute)
                width(100.percent - 50.px)
                height(100.percent - 60.px)
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                alignItems(AlignItems.Center)
                backgroundColor(Color.blue)
            }
        }) {
            Div(attrs = {
                style {
                    top(0.px)
                    left(0.px)
                    position(Position.Absolute)
                    width(100.percent)
                    height(30.px)
                    textAlign("left")
                }
            }) {
                B { Text("Github") }
            }
            Div(attrs = {
                style {
                    position(Position.Absolute)
                    width(100.percent)
                    height(50.percent)
                    backgroundColor(Color.yellow)
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                }
            }) {
                Text("AAAAAA")
//                Img(src = "url()")
            }
            Div(attrs = {
                style {
                    width(100.percent)
                    bottom(0.px)
                    position(Position.Absolute)
                    display(DisplayStyle.Flex)
                }
            }) {
                Div(attrs = {
                    style {
                        flex(1)
                        justifyContent(JustifyContent.Center)
                    }
                }) {
                    B { Text("닫기") }
                }
                Div(attrs = {
                    style {
                        flex(1)
                        justifyContent(JustifyContent.Center)
                    }
                }) {
                    B { Text("연결") }
                }
            }
        }
    }
}