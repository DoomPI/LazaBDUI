import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlinJvm
	springFrameworkBoot
	springDependencyManagement
	kotlinSpring
}

group = "ru.pyroman.laza"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
	useCommonLibraries()

	useModule(ProjectModules.Feature.auth)
	useModule(ProjectModules.Feature.product)
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
