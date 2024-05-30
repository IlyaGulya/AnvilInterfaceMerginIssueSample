import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.the

val Project.libs: LibrariesForLibs
    get() = the<LibrariesForLibs>()

val LibrariesForLibs.minSdk: Int
    get() = versions.minSdk.get().toInt()

val LibrariesForLibs.compileSdk: Int
    get() = versions.compileSdk.get().toInt()

val LibrariesForLibs.targetSdk: Int
    get() = versions.targetSdk.get().toInt()