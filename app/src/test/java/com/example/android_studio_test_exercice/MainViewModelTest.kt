package com.example.android_studio_test_exercice

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.android_studio_test_exercice.viewmodel.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {
    @get:Rule
    val instantRule = InstantTaskExecutorRule()

    @Test
    fun initialValue_isZero() {
        val vm = MainViewModel()
        assertEquals(0, vm.count.value)
    }

    @Test
    fun increment_increasesValue() {
        val vm = MainViewModel()
        vm.increment()
        assertEquals(1, vm.count.value)
    }

    @Test
    fun decrement_decreasesValue() {
        val vm = MainViewModel()
        vm.increment()
        vm.decrement()
        assertEquals(0, vm.count.value)
    }

    @Test
    fun reset_setsZero() {
        val vm = MainViewModel()
        vm.setCount(5)
        vm.reset()
        assertEquals(0, vm.count.value)
    }

    @Test
    fun setCount_updatesValue() {
        val vm = MainViewModel()
        vm.setCount(42)
        assertEquals(42, vm.count.value)
    }
}
