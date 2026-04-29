package com.example.android_studio_test_exercice

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.example.android_studio_test_exercice.MainActivity
import org.junit.Rule
import org.junit.Test

class MainViewInstrumentedTest {
    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun mainView_showsInitialAndRespondsToClicks() {
        val countTag = "countText"
        val incTag = "incrementButton"
        val decTag = "decrementButton"
        val resetTag = "resetButton"

        composeRule.onNodeWithTag(countTag).assertTextEquals("Count: 0")
        composeRule.onNodeWithTag(incTag).performClick()
        composeRule.onNodeWithTag(countTag).assertTextEquals("Count: 1")
        composeRule.onNodeWithTag(decTag).performClick()
        composeRule.onNodeWithTag(countTag).assertTextEquals("Count: 0")
        composeRule.onNodeWithTag(incTag).performClick()
        composeRule.onNodeWithTag(incTag).performClick()
        composeRule.onNodeWithTag(countTag).assertTextEquals("Count: 2")
        composeRule.onNodeWithTag(resetTag).performClick()
        composeRule.onNodeWithTag(countTag).assertTextEquals("Count: 0")
    }
}