package ui.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img

@Composable
fun WifiIcon() {
    Img(src = "https://img.icons8.com/fluency-systems-regular/96/ffffff/wifi--v1.png", attrs = {
        style {
            height(10.px)
            width(10.px)
        }
    })

}

@Composable
fun FrequencyIcon() {
    Img(src = "https://img.icons8.com/fluency-systems-filled/96/ffffff/high-connection--v2.png", attrs = {
        style {
            height(10.px)
            width(13.px)
        }
    })
}

@Composable
fun BatteryIcon() {
    Img(src = "https://img.icons8.com/material-rounded/96/ffffff/full-battery.png", attrs = {
        style {
            height(10.px)
            width(13.px)
        }
    })
}