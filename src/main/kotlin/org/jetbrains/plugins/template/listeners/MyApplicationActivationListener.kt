package org.jetbrains.plugins.template.listeners


import org.jetbrains.plugins.template.services.MyProjectService
import com.intellij.openapi.application.ApplicationActivationListener
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.IdeFrame
internal class MyApplicationActivationListener : ApplicationActivationListener {

    companion object {
        var p: Project? = null
    }


    override fun applicationActivated(ideFrame: IdeFrame) {
        super.applicationActivated(ideFrame)
        p = ideFrame.project
        p?.getService(MyProjectService::class.java)
    }

    override fun applicationDeactivated(ideFrame: IdeFrame) {
        super.applicationDeactivated(ideFrame)
        p = null
    }
}
