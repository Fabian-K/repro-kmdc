import dev.petuska.kmdc.button.MDCButton
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            MDCButton(text = "Test") { }
        }
    }
}