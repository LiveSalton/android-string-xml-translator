import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.21"
}

group = "com.salton123"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.apache.httpcomponents:httpclient:4.5.6")
    implementation("com.alibaba:fastjson:1.2.54")
    implementation("org.jsoup:jsoup:1.14.3")
    implementation("com.github.Ars3ne:internationale:1.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
//    implementation("com.github.EvanRupert:ExcelKt:v0.1.2")
    implementation("org.apache.poi:poi:+")
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}