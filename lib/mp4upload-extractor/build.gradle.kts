plugins {
    id("lib-android")
}

dependencies {
    implementation("dev.datlag.jsunpacker:jsunpacker:1.0.2") {
        exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib-jdk8")
    }
}
