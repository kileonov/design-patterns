tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "org.houseproject.MainKt"
    }
}
