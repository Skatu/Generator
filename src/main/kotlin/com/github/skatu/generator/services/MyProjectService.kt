package com.github.skatu.generator.services

import com.intellij.openapi.project.Project
import com.github.skatu.generator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
