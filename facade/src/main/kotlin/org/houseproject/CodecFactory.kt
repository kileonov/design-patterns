package org.houseproject

class CodecFactory {

    companion object {
        fun extract(file: VideoFile): Codec = when (file.codecType) {
            "mp4" -> {
                println("CodecFactory: extracting mp4 audio...")
                MP4CompressionCodec()
            }
            "ogg" -> {
                println("CodecFactory: extracting ogg audio...")
                OggCompressionCodec()
            }
            else -> throw UnsupportedOperationException("Cannot extract file")
        }
    }
}
