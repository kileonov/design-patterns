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
//    tasks.withType<Jar> {
//        destinationDirectory.set(File("${project.buildDir}"))
//    }

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
        testCompile("junit", "junit", "4.12")
    }
}
