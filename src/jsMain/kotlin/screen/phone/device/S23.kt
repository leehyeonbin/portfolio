package screen.phone.device

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.black
import org.jetbrains.compose.web.css.Color.blue
import org.jetbrains.compose.web.dom.Div
import screen.phone.Phone
import screen.phone.device.feature.Clock
import ui.component.ClockComponent
import ui.component.FrequencyIcon
import ui.component.WifiIcon


@Composable
fun S23() {

    Div(attrs = {
        style {
            borderRadius(40.px)
            backgroundColor(black)
            height(760.px)
            width(360.px)
            border {
                width = 2.px
                color = rgb(r = 169, g = 169, b = 171)
                style = LineStyle.Solid
            }
        }
    }) {
        Div(attrs = {
            style {
                borderRadius(39.px)
                width(100.percent - 4.px)
                height(100.percent - 4.px)
                border {
                    width = 2.px
                    color = rgb(r = 69, g = 69, b = 71)
                    style = LineStyle.Solid
                }
            }
        }) {
            Div(attrs = {
                style {
                    borderRadius(38.px)
                    width(100.percent - 4.px)
                    height(100.percent - 4.px)
                    border {
                        width = 2.px
                        color = rgb(r = 121, g = 121, b = 123)
                        style = LineStyle.Solid
                    }
                }
            }) {
                Div(attrs = {
                    style {
                        borderRadius(37.px)
                        width(100.percent - 4.px)
                        height(100.percent - 4.px)
                        border {
                            width = 2.px
                            color = rgb(r = 165, g = 165, b = 167)
                            style = LineStyle.Solid
                        }
                    }
                }) {
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
                                marginLeft(2.px)
                                marginTop(2.px)
                                borderRadius(40.px)
                                width(100.percent - 4.px)
                                height(100.percent - 4.px)
                                backgroundImage("url($backgroundImage)")
                                backgroundPosition("center")
                                backgroundSize("cover")
                                position(Position.Relative)
                            }
                        }) {
                            StatusBar()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun StatusBar() {
    Div(attrs = {
        style {
            width(100.percent - 60.px)
            position(Position.Absolute)
            paddingLeft(30.px)
            paddingTop(10.px)
        }
    }) {
        ClockReceiver()
        PhoneStatus()
    }
}

@Composable
fun ClockReceiver() {
    val time = remember {
        mutableStateOf("0:0")
    }
    rememberCoroutineScope().launch {
        Clock().distinctUntilChanged().collect {
            time.value = it
            console.log(it)
        }
    }
    ClockComponent(time.value)
}

@Composable
fun PhoneStatus() {
    Div (attrs = {
        style {
            right(0.px)
            width(100.px)
            position(Position.Absolute)
        }
    }){
        WifiIcon()
        FrequencyIcon()
    }
}

@Composable
fun Camera() {

}