package com.github.laur0r.dynamicdefuseplugin.services

import com.intellij.openapi.project.Project
import com.github.laur0r.dynamicdefuseplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
