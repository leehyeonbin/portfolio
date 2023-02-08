package ui.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.white
import org.jetbrains.compose.web.dom.Div

@Composable
fun WifiIcon() {
    Div (attrs = {
        style {
            width(14.px)
            height(6.px)
            borderRadius(8.px, 8.px, 0.px, 0.px)
            borderTop(1.px, LineStyle.Solid, white)
        }
    }){
        Div (attrs = {
            style {
                width(10.px)
                height(6.px)
                borderRadius(6.px, 6.px, 0.px, 0.px)
                borderTop(1.px, LineStyle.Solid, white)
                marginTop(2.px)
                marginLeft(2.px)
            }
        }){
            Div (attrs = {
                style {
                    width(6.px)
                    height(6.px)
                    borderRadius(6.px, 6.px, 0.px, 0.px)
                    borderTop(1.px, LineStyle.Solid, white)
                    marginTop(2.px)
                    marginLeft(2.px)
                }
            }){
                Div (attrs = {
                    style {
                        width(2.px)
                        height(2.px)
                        backgroundColor(white)
                        borderRadius(50.percent)
                        marginTop(2.px)
                        marginLeft(2.px)
                    }
                }){

                }
            }
        }
    }
}

@Composable
fun FrequencyIcon() {

}