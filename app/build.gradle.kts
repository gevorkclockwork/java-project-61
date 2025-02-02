plugins {
    application
    id("java")
    id("com.github.ben-manes.versions") version "0.51.0"
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"
application {
    mainClass.set("hexlet.code.App")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}