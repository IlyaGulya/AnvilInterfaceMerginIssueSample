plugins {
    id("com.google.devtools.ksp")
    id("com.squareup.anvil")
}

anvil {
    useKsp(contributesAndFactoryGeneration = true)
    generateDaggerFactories = true
}

pluginManager.withPlugin("kotlin-kapt") {
    error("Please, use `id(\"qa.build.anvil.kapt\")` instead")
}

dependencies {
//    "ksp"(project(":codegen:anvil"))
//    "ksp"(libs.anvil.utils.compiler)

    "implementation"(libs.dagger)
//    "implementation"(libs.anvil.utils.annotations)
}