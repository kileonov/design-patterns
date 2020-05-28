package org.houseproject

class VideoFile(val fileName: String) {
    var codecType: String = fileName.substring(fileName.indexOf(".") + 1)
}
