rootProject.name = "LazaBDUI"

include(":common:screen")
include(":feature:auth-feature")
include(":feature:bottom-button-feature")
include(":feature:home-feature")
include(":feature:product-feature")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        google()
        flatDir {
            dirs("libs")
        }
    }
}