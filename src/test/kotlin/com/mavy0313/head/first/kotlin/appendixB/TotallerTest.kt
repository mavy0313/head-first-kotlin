package com.mavy0313.head.first.kotlin.appendixB

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TotallerTest {
    @Test
    fun `should be able to add 3 and 4`() {
        val totaller = Totaller()

        assertEquals(3, totaller.add(3))
        assertEquals(7, totaller.add(4))
        assertEquals(7, totaller.total)
    }
}

