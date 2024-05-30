plugins {
    id("qa.build.feature")
    id("qa.build.anvil.kapt")
    alias(libs.plugins.kotlin.kapt)
}

dependencies {
    implementation(project(":module"))
    implementation(libs.dagger)
    kapt(libs.dagger.compiler)
}