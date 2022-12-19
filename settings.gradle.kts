@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    buildscript {
            repositories {
                maven("https://gradle.iranrepo.ir")
                maven("https://jitpack.io")
            }
        }
    repositories {
        maven("https://gradle.iranrepo.ir")
        maven("https://jitpack.io")
        google()
        mavenCentral()
    }
}
rootProject.name = "Magisk"
include(":app", ":app:shared", ":native", ":stub")
