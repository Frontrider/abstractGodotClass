plugins {
    id("com.utopia-rise.godot-kotlin-jvm") version "0.5.0-3.5.1"
}

repositories {
    mavenCentral()
}

dependencies{
}

godot {
    isAndroidExportEnabled.set(false)
    d8ToolPath.set(File("${System.getenv("ANDROID_SDK_ROOT")}/build-tools/31.0.0/d8"))
    androidCompileSdkDir.set(File("${System.getenv("ANDROID_SDK_ROOT")}/platforms/android-30"))
}

//setup gdignores
fun setupGdIgnore(){
    buildDir.mkdirs()
    if(buildDir.exists()) {
        File(buildDir,".gdignore").writeText("")
    }
    File(project.rootDir,"gradle/.gdignore").writeText("")
}
setupGdIgnore()
tasks.named("clean"){
    doLast {
        setupGdIgnore()
    }
}