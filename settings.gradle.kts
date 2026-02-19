pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/Fiserv/mobile-payments-android")
            credentials {
                username = "GITHUB_USER_NAME"
                password = "GITHUB_ACCESS_TOKEN"
            }
        }
    }
}

rootProject.name = "Fiserv Mobile Payments Sample"
include(":app")
 