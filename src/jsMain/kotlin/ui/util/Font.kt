package ui.util

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontStyle
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun NotoNomalText(text: String) {
    Div (attrs = {
        style {
            fontFamily("Noto Sans KR")
            fontStyle("normal")
        }
    }) {
        Text(text)
    }
}