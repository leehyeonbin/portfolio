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
import org.jetbrains.compose.web.css.Color.white
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text
import screen.phone.device.feature.Clock


@Composable
fun S23() {

    Div(attrs = {
        style {
            borderRadius(68.px)
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
                borderRadius(67.px)
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
                    borderRadius(66.px)
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
                        borderRadius(65.px)
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
                            borderRadius(64.px)
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
                                borderRadius(63.px)
                                width(100.percent - 4.px)
                                height(100.percent - 4.px)
                                backgroundImage("url($backgroundImage)")
                                backgroundPosition("center")
                                backgroundSize("cover")
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
    ClockComponent()
}

@Composable
fun ClockComponent() {
    val time = remember {
        mutableStateOf("0:0")
    }
    rememberCoroutineScope().launch{
        Clock().distinctUntilChanged().collect {
            time.value = it
            console.log(it)
        }
    }
    H3 (attrs = {
        style {
            color(white)
        }
    }) {
        Text(time.value)
    }
}

@Composable
fun Camera() {

}