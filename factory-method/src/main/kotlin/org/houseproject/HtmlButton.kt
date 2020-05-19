package org.houseproject

class HtmlButton : Button {
    override fun render() {
        println("<button>Download</button>")
    }

    override fun onClick() {
        println("Downloading file...")
    }
}
