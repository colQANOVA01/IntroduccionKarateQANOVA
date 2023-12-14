plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.intuit.karate:karate-apache:0.9.6")
    testImplementation("com.intuit.karate:karate-junit5:1.4.0")
}

sourceSets {
    test {
        resources {
            srcDirs("src/test/java")
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

