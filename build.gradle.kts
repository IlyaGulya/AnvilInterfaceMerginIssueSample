plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.kapt) apply false
    alias(libs.plugins.kotlin.serialization) apply false
//    alias(libs.plugins.kotlin.compose) apply false

    alias(libs.plugins.anvil) apply false
    alias(libs.plugins.ksp) apply false
}