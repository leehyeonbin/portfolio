package ui.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.white
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import screen.phone.display.app.AppIconData
import ui.style.AppIconStyleSheet

@Composable
fun Apps(app: AppIconData) {
    Style(AppIconStyleSheet)
    Div (attrs = {
        classes(AppIconStyleSheet.container)
    }){
        Img(src = app.image, attrs = {
            style {
                height(45.px)
                width(45.px)
                borderRadius(18.px)
            }
        })
        H6 (attrs = {
            style {
                color(white)
            }
        }){
            Text(app.appName)
        }
    }
}