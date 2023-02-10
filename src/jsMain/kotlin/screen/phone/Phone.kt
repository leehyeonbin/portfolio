package screen.phone

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import screen.phone.device.S23

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun Phone() {
    Div (attrs = {
        style {

            animation(keyframesName = "phone-move", builder = {
                duration(1.s)
            })
            position(Position.Absolute)
            right(0.px)
            CSSKeyframesBuilder {
                from {
                    transform {
                        translateY((-120).percent)
                    }
                }
                to {
                    transform {
                        translateY(0.percent)
                    }
                }
            }
//            buildKeyframes(name = "phone-move", builder = )
        }
    }){
        S23()
    }
}