package screen.phone.display.app

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

@Composable
fun BottomApps() {
    Div(attrs = {
        style {
            display(DisplayStyle.Grid)
            width(100.percent)
            gridTemplateColumns("repeat(4, 1fr) ")
            bottom(40.px)
            position(Position.Absolute)
        }
    }) {
        A(href = "https://leehyeonbin.notion.site/leehyeonbin/Lee-Hyeonbin-80566cae03d74542824eed7a4ba499aa") {
            Img(src = "./image/Note.svg", attrs = {
                style {
                    width(50.px)
                    height(50.px)
                }
            })
        }
        A(href = "https://github.com/leehyeonbin") {
            Img(src = "./image/message (2).svg", attrs = {
                style {
                    width(50.px)
                    height(50.px)
                }
            })
        }
        A(href = "https://github.com/leehyeonbin") {
            Img(src = "./image/Phone.svg", attrs = {
                style {
                    width(50.px)
                    height(50.px)
                }
            })
        }
        A(href = "https://www.linkedin.com/in/%ED%98%84%EB%B9%88-%EC%9D%B4-93328525b/") {
            Img(src = "./image/linkedin.svg", attrs = {
                style {
                    width(50.px)
                    height(50.px)
                }
            })
        }
    }
}