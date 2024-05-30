pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    includeBuild("buildsystem")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "AnvilInterfaceMergingIssueSample"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":entrypoint")
include(":module")