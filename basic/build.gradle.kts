plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "basic"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "main.MainKt"
}
