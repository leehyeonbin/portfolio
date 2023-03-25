package screen.phone

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import screen.phone.device.S23
import ui.style.PhoneStyleSheet

@Composable
fun Phone() {
    Style(PhoneStyleSheet)
    Div (attrs = {
        classes(PhoneStyleSheet.container)
    }){
        S23()
    }
}