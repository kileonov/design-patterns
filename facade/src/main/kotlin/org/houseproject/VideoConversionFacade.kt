package org.houseproject

import java.io.File

class VideoConversionFacade {

    fun convertVideo(fileName: String, format: String): File {
        println("VideoConversionFacade: conversion started.")
        val file = VideoFile(fileName)
        val sourceCodec = CodecFactory.extract(file)
        val destinationCodec = if (format == "mp4") {
            MP4CompressionCodec()
        } else {
            OggCompressionCodec()
        }
        val buffer = BitrateReader.read(file, sourceCodec)
        val intermediateResult = BitrateReader.convert(buffer, destinationCodec)
        val result = AudioMixer().fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result
    }
}
