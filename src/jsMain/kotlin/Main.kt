import org.jetbrains.compose.web.renderComposable
import screen.main.MainScreen

fun main() {

    renderComposable(rootElementId = "root") {
        MainScreen()
    }
}

