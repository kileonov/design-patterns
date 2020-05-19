package org.houseproject

class ButtonFactory {

    fun createButton(type: String) = when (type) {
        WINDOWS_BUTTON -> WindowsButton()
        HTML_BUTTON -> HtmlButton()
        else -> throw UnsupportedOperationException("Cannot create non existed button")
    }

    companion object {
        const val WINDOWS_BUTTON = "WINDOWS_BUTTON"
        const val HTML_BUTTON = "HTML_BUTTON"
    }
}
