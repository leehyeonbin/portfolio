import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import screen.main.MainScreen
import screen.main.PhoneScreen
import ui.style.BodyStyleSheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(BodyStyleSheet)
        MainScreen()
        PhoneScreen()
    }
}

