package screen.phone.device

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.Color.black
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

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
                        Div(attrs = {
                            style {
                                marginLeft(2.px)
                                marginTop(2.px)
                                borderRadius(63.px)
                                width(100.percent - 4.px)
                                height(100.percent - 4.px)
                                backgroundImage("url(https://images.unsplash.com/photo-1519810755548-39cd217da494?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=776&q=80)")
                                backgroundPosition("center")
                                backgroundSize("cover")
                            }
                        }) {

                        }
                    }
                }
            }
        }
    }
}