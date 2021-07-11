plugins {
    kotlin("multiplatform") version "1.5.20"
    `maven-publish`
}

group = "games.perses"
version = "0.3.0-SNAPSHOT"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    mavenCentral()
}

kotlin {
    /* Targets configuration omitted. 
    *  To find out how to configure the targets, please follow the link:
    *  https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-targets */
    linuxX64("linux") {
        binaries {
            executable {
                entryPoint = "main"

                linkerOpts(
                    "-L/usr/lib/x86_64-linux-gnu",
                    "-lcsfml-graphics",
                    "-lcsfml-audio",
                    "-lcsfml-window",
                    "-lcsfml-network",
                    "-lcsfml-system"
                )
            }
        }

        compilations["main"].cinterops {
            val sfml by creating {
                when (preset) {
                    presets["linuxX64"] -> includeDirs("/usr/include")
                }
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))

                //implementation("io.github.microutils:kotlin-logging:1.7.8")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val linuxMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
    }
}
