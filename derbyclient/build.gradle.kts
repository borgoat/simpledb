plugins {
    java
}

repositories {
    mavenCentral()
}

val derbyVersion = "10.17.1.0"

dependencies {
    implementation("org.apache.derby:derbyclient:$derbyVersion")
    implementation("org.apache.derby:derbytools:$derbyVersion")
}
