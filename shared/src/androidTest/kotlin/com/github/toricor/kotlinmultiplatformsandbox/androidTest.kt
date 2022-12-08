package com.github.toricor.kotlinmultiplatformsandbox

import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidGreetingTest {

    @Test
    fun testExample() = runTest {
        assertTrue("Check Android is mentioned", Greeting().greeting().contains("Android"))
    }
}