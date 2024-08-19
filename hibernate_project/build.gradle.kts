plugins {
    id("java")
}

group = "org.project"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hibernate:hibernate-core-jakarta:5.6.11.Final")
    implementation("mysql:mysql-connector-java:8.0.30")
    implementation("p6spy:p6spy:3.9.1")
}

tasks.test {
    useJUnitPlatform()
}