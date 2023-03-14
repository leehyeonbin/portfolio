import org.jetbrains.compose.web.renderComposable
import screen.main.MainScreen
import screen.main.PhoneScreen

fun main() {

    renderComposable(rootElementId = "root") {
        MainScreen()
        PhoneScreen()
    }
}

