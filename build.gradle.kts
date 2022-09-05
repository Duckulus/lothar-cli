plugins {
    id("java")
    application
}

group = "us.duckul"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

val mainClass : String by properties

application {
    mainClass.set("us.duckul.lothar.Main")
}

tasks {
    jar {
        manifest {
            attributes["Main-Class"] = mainClass
        }
    }

    getByName<Test>("test") {
        useJUnitPlatform()
    }
}