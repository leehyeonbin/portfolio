package ui.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Color.white
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H6
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import screen.phone.display.app.AppIconData

@Composable
fun Apps(app: AppIconData) {
    Div {
        Img(src = app.image, attrs = {
            style {
                height(40.px)
                width(40.px)
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