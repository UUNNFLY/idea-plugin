package com.github.uunnfly.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.uunnfly.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
