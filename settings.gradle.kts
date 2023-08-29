rootProject.name = "LazaBDUI"

include(":common:screen")
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