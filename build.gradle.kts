plugins {
    java
    kotlin("jvm") version "1.3.72"
}

group = "org.houseproject"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {

    apply(plugin = "java")
    apply(plugin = "kotlin")

    repositories {
        mavenCentral()
    }

    tasks {
        compileKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
        compileTestKotlin {
            kotlinOptions.jvmTarget = "1.8"
        }
    }

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_13
        targetCompatibility = JavaVersion.VERSION_13
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.1.0")
        testImplementation("org.junit.jupiter", "junit-jupiter-engine", "5.1.0")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    tasks.withType<Jar> {
        manifest {
            attributes["Main-Class"] = "org.houseproject.MainKt"
        }

        from({
           configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
         })
    }

}
