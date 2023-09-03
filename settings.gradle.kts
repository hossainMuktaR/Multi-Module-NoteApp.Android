pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "MultiModuleNoteApp"
include(":app")
include(":core:redux")
include(":feature:note:data")
include(":feature:note:domain")
include(":feature:note:utils")
include(":feature:note:presentation")
