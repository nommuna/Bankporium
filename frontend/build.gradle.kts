import com.moowork.gradle.node.npm.NpmTask
plugins {
    id ("com.github.node-gradle.node") version "2.2.4"
}

//node {
//    version = "12.18.3"
//    npmVersion = ""
//    npmInstallCommand = "install"
//    distBaseUrl = "https://nodejs.org/dist"
//    download = false
//    workDir = file("${project.projectDir}/.cache/nodejs")
//    npmWorkDir = file("${project.projectDir}/.cache/npm")
//}

tasks {
    val npmTestTask = getByName("npm_test")
    npmTestTask.description = "run react scripts test"
    val npmInstallTask = getByName("npmInstall")
    register("test"){
        dependsOn(listOf(npmTestTask))
    }
}