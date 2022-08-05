plugins {
    kotlin("multiplatform") version "1.7.10"
    `maven-publish`
}

group = "games.perses"
version = "0.3.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    nativeTarget.apply {
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

        compilations.getByName("main") {    // NL
            cinterops {                     // NL
                val sfml by creating {
                    when (preset) {
                        presets["linuxX64"] -> includeDirs("/usr/include")
                    }
                }
            }
        }
    }

    sourceSets {
        val nativeMain by getting
        val nativeTest by getting
    }
}

