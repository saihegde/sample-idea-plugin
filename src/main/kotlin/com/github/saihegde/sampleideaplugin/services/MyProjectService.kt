package com.github.saihegde.sampleideaplugin.services

import com.github.saihegde.sampleideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
