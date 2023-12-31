object Dependencies {

    object Kotlin {
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect"
    }

    object SpringFramework {

        object Boot {
            private const val version = "3.1.2"
            const val group = "org.springframework.boot"

            const val starterDataJpa = "$group:spring-boot-starter-data-jpa:$version"
            const val starterValidation = "$group:spring-boot-starter-validation:$version"
            const val starterWeb = "$group:spring-boot-starter-web:$version"

            // test
            const val starterTest = "$group:spring-boot-starter-test:$version"
        }
    }

    object Jackson {

        object Module {
            const val kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin"
        }
    }

    object PostgreSQL {
        const val postgreSQL = "org.postgresql:postgresql"
    }

    object Divkit {

        object JsonBuilder {
            const val jsonBuilder = "com.yandex:kotlin-json-builder"
        }
    }

    object JUnit {

        object Jupiter {
            private const val version = ""
        }
    }
}