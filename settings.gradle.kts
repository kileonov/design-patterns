rootProject.name = "design-patterns"

include(
    *rootProject.projectDir.listFiles()
        ?.filter { it.isDirectory }
        ?.filter { !it.name.startsWith(".") && it.name != "build" }
        ?.map { it.name }
        ?.toTypedArray()
        .orEmpty()
)
