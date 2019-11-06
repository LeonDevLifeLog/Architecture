package com.github.leondevlifelog.service.hub.plugin


import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class ServiceHubPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        BaseExtension app = project.getExtensions().getByType(BaseExtension);
        app.registerTransform(new ServiceHubTransform(project))
    }
}