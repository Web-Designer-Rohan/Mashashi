plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

android {
    [span_3](start_span)namespace = "com.rohan.mashashi"[span_3](end_span)
    [span_4](start_span)compileSdk = 34[span_4](end_span)

    defaultConfig {
        [span_5](start_span)applicationId = "com.rohan.mashashi"[span_5](end_span)
        minSdk = 26
        targetSdk = 34
        [span_6](start_span)versionCode = 1[span_6](end_span)
        [span_7](start_span)versionName = "1.0.0"[span_7](end_span)

        [span_8](start_span)testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"[span_8](end_span)
        
        vectorDrawables {
            [span_9](start_span)useSupportLibrary = true[span_9](end_span)
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        debug {
            [span_10](start_span)isDebuggable = true[span_10](end_span)
        }
    }

    compileOptions {
        [span_11](start_span)sourceCompatibility = JavaVersion.VERSION_17[span_11](end_span)
        [span_12](start_span)targetCompatibility = JavaVersion.VERSION_17[span_12](end_span)
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        [span_13](start_span)compose = true[span_13](end_span)
    }

    composeOptions {
        [span_14](start_span)kotlinCompilerExtensionVersion = "1.5.4"[span_14](end_span)
    }

    packaging {
        resources {
            [span_15](start_span)excludes += "/META-INF/{AL2.0,LGPL2.1}"[span_15](end_span)
        }
    }
}

dependencies {
    // Core & Compose
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    [span_16](start_span)implementation("androidx.activity:activity-compose:1.8.2")[span_16](end_span)
    [span_17](start_span)implementation(platform("androidx.compose:compose-bom:2023.10.01"))[span_17](end_span)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    // Hilt DI
    implementation("com.google.dagger:hilt-android:2.5.1")
    ksp("com.google.dagger:hilt-compiler:2.5.1")
    
    // Camera & ML Kit (The Workout Vision Engine)
    implementation("androidx.camera:camera-camera2:1.3.1")
    implementation("androidx.camera:camera-lifecycle:1.3.1")
    [span_18](start_span)implementation("androidx.camera:camera-view:1.3.1")[span_18](end_span)
    implementation("com.google.mlkit:pose-detection-accurate:17.1.0")

    // Room Database (The Progress Engine)
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")

    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-crashlytics-ktx")
}
