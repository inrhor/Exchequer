plugins {
    `java-library`
    `maven-publish`
    id("io.izzel.taboolib") version "1.40"
    id("org.jetbrains.kotlin.jvm") version "1.5.10"
}

taboolib {
    install("common")
    install("module-metrics")
    install("platform-sponge-api8")
    install("platform-sponge-api7")
    install("platform-nukkit")
    install("platform-bukkit")
    classifier = null
    version = "6.0.9-5"
}

sourceSets {
    main {
        java {
            srcDir(file("src/main"))
        }
    }
}

java {
    withSourcesJar()
}

repositories {
    maven { url = uri("https://repo.nukkitx.com/maven-snapshots") }
    maven { url = uri("https://repo.spongepowered.org/maven") }
    mavenCentral()
}

dependencies {
    compileOnly("ink.ptms.core:v11800:11800-minimize:api")
    compileOnly("ink.ptms.core:v11800:11800-minimize:mapped")
    compileOnly("cn.nukkit:nukkit:2.0.0-SNAPSHOT")
    compileOnly("org.spongepowered:spongeapi:7.2.0")
    compileOnly("org.spongepowered:spongeapi:8.0.0-SNAPSHOT")
    compileOnly(kotlin("stdlib"))
    compileOnly(fileTree("libs"))
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

publishing {
    repositories {
        maven {
            url = uri("https://repo.tabooproject.org/repository/releases")
            credentials {
                username = project.findProperty("taboolibUsername").toString()
                password = project.findProperty("taboolibPassword").toString()
            }
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }
    publications {
        create<MavenPublication>("library") {
            from(components["java"])
            groupId = project.group.toString()
        }
    }
}