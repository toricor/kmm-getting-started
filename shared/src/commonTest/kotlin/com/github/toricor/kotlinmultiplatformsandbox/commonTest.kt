package com.github.toricor.kotlinmultiplatformsandbox

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() = runTest {
        assertTrue(Greeting().greeting().contains("Guess what it is"), "Check 'Guess what it is' is mentioned")
    }
}