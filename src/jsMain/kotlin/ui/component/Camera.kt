package ui.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.black
import org.jetbrains.compose.web.css.Color.blue
import org.jetbrains.compose.web.css.Color.red
import org.jetbrains.compose.web.css.Color.white
import org.jetbrains.compose.web.dom.Div

@Composable
fun Camera() {
    Div(attrs ={
        style {
            width(10.px)
            height(10.px)
            display(DisplayStyle.Grid)
            gridTemplateColumns("repeat(2, 1fr) ")
            gridTemplateRows("repeat(2, 1fr) ")
            position(Position.Absolute)
            borderRadius(50.percent)
            overflow("hidden")
            left(48.percent)
            marginTop(10.px)
        }
    }){
        Div(attrs = {
            style {
                background("radial-gradient(rgb(68, 80, 127), rgb(1, 0 , 0))")
            }
        })
        Div(attrs = {
            style {
                backgroundColor(rgb(1, 0, 0))
            }
        })
        Div(attrs = {
            style {
                backgroundColor(rgb(1, 0, 0))
            }
        })
        Div(attrs = {
            style {
                background("radial-gradient(rgb(61, 52, 101), rgb(41, 69, 78), rgb(1, 0, 0))")
            }
        })
    }
}