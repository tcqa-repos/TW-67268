plugins {
    kotlin("multiplatform") version "1.4.0-rc"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

val javaVersion = "1.8"
val kotlinApiVersion = "1.4"
val kotlinLanguageVersion = "1.4"
val kotlinRuntimeVersion = "1.4.0-rc"

kotlin {
    js {
        compilations.forEach { configuration ->
            configuration.kotlinOptions {
                sourceMap = true
                sourceMapEmbedSources = "always"
                moduleKind = "umd"
                apiVersion = kotlinApiVersion
                languageVersion = kotlinLanguageVersion
            }
        }
        nodejs {
            testTask {
                useMocha {
                    timeout = "3s"
                }
            }
        }
    }
    jvm {
        compilations.forEach { configuration ->
            configuration.kotlinOptions {
                jvmTarget = javaVersion
                apiVersion = kotlinApiVersion
                languageVersion = kotlinLanguageVersion
            }
        }
    }
    sourceSets {
        commonTest {
            dependencies {
                implementation(kotlin("test", kotlinRuntimeVersion))
                implementation(kotlin("test-annotations-common", kotlinRuntimeVersion))
            }
        }
        js().compilations["test"].defaultSourceSet {
            dependencies {
                implementation(kotlin("test-js", kotlinRuntimeVersion))
            }
        }
        jvm().compilations["test"].defaultSourceSet {
            dependencies {
                implementation(kotlin("test-junit", kotlinRuntimeVersion))
            }
        }
    }
}

kotlin.sourceSets.all {
    languageSettings.apply {
        apiVersion = kotlinApiVersion
        languageVersion = kotlinLanguageVersion
    }
}