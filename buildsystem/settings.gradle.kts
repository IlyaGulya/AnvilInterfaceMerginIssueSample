rootProject.name = "buildsystem-convention"

dependencyResolutionManagement {
    repositories {
        mavenCentral {
            content {
                includeGroup("com.google.http-client")
            }
        }
        google {
            content {
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
                includeGroupAndSubgroups("androidx")
            }
        }
        gradlePluginPortal()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}