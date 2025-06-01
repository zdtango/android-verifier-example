package com.github.zdtango.androidverifierexample

import com.intellij.DynamicBundle
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.PropertyKey
import com.android.io.FileWrapper
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.psi.PsiManager
import java.io.File
import org.jetbrains.android.AndroidAnnotatorUtil

@NonNls
private const val BUNDLE = "messages.MyBundle"

object MyBundle : DynamicBundle(BUNDLE) {

    val ioFile = File("TEst")
    val file = FileWrapper(ioFile)

    val project = com.intellij.openapi.project.ProjectManager.getInstance().openProjects.firstOrNull()
    val virtualFile = LocalFileSystem.getInstance().findFileByIoFile(ioFile)
    val psiFile = virtualFile?.let { project?.let { PsiManager.getInstance(it).findFile(virtualFile) } }
    val annotator = AndroidAnnotatorUtil.getFileType(psiFile!!)

    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getMessage(key, *params)

    @Suppress("unused")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getLazyMessage(key, *params)
}
