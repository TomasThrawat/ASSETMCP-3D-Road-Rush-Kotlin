plugins {
    id("com.android.application")
    kotlin("android")
}
android {
    namespace = "com.tomasthrawat.roadrush"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.tomasthrawat.roadrush"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
