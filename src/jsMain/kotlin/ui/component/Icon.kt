package ui.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.white
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.w3c.dom.Image

@Composable
fun WifiIcon() {
    Img(src = "https://img.icons8.com/fluency-systems-filled/15/ffffff/wi-fi-good.png")

}

@Composable
fun FrequencyIcon() {
    Img(src="https://img.icons8.com/fluency-systems-filled/15/ffffff/high-connection--v2.png" )
}

@Composable
fun BatteryIcon() {
    Img(src="https://img.icons8.com/material-rounded/15/ffffff/full-battery.png")
}