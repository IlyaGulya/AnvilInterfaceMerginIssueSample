plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    `kotlin-dsl`
}

kotlin {
    compilerOptions {
        optIn.addAll(
            "kotlinx.serialization.ExperimentalSerializationApi"
        )
    }
}

dependencies {
    implementation(gradleApi())
//    implementation(libs.plugin.android)
//    implementation(libs.plugin.android.gradleApi)
    implementation(libs.plugin.kotlin)
//    implementation(libs.plugin.kotlin.compose)
    implementation(libs.plugin.anvil)
    implementation(libs.plugin.ksp)

    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-receivers")
    }
}