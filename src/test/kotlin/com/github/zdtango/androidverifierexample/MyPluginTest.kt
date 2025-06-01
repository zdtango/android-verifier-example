package com.github.zdtango.androidverifierexample

import com.intellij.ide.highlighter.XmlFileType
import com.intellij.openapi.components.service
import com.intellij.psi.xml.XmlFile
import com.intellij.testFramework.TestDataPath
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.util.PsiErrorElementUtil
import com.github.zdtango.androidverifierexample.services.MyProjectService

@TestDataPath("\$CONTENT_ROOT/src/test/testData")
class MyPluginTest : BasePlatformTestCase() {

    fun testXMLFile() {
    }

    fun testRename() {
    }

    fun testProjectService() {
    }

    override fun getTestDataPath() = "src/test/testData/rename"
}
