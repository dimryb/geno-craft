rootProject.name = "geno-craft"

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}

include("hello-module")
include("hello-module")
