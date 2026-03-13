// Top-level build file
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
    // Updated Hilt plugin ID and version for better compatibility
    id("com.google.dagger.hilt.android") version "2.51" apply false 
    id("com.google.gms.google-services") version "4.4.1" apply false
    id("com.google.firebase.crashlytics") version "2.9.9" apply false
}

extra["minSdkVersion"] = 26
extra["targetSdkVersion"] = 34
extra["compileSdkVersion"] = 34

