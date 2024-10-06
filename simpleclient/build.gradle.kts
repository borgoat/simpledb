plugins {
    application
}

application {
    mainClass = "simpleclient.SimpleIJ"
}

dependencies {
    implementation(project(":simpledb"))
}
