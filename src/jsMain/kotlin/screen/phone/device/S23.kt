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
import org.jetbrains.compose.web.dom.Div
import screen.phone.device.feature.Clock
import screen.phone.display.DisplayScreen
import ui.component.*


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
                    DisplayScreen()
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
    Div(attrs = {
        style {
            right(0.px)
            width(50.px)
            position(Position.Absolute)
            top(5.px)
        }
    }) {
        WifiIcon()
        FrequencyIcon()
        BatteryIcon()
    }
}