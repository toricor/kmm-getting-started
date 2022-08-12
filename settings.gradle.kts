pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KotlinMultiplatformSandbox"
include(":androidApp")
include(":shared")