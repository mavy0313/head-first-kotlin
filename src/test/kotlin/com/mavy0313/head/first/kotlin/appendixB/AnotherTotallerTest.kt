package com.mavy0313.head.first.kotlin.appendixB

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

internal class AnotherTotallerTest : StringSpec({

    "should be able to add 3 and 4" {
        val totaller = Totaller()

        totaller.add(3) shouldBe 3
        totaller.add(4) shouldBe 7
        totaller.total shouldBe 7
    }

    "should be able to add lots of different numbers" {
        forall(
            row(1,2,3),
            row(19,47,66),
            row(11,21,32)
        ) { x, y, expectedTotal ->
            val totaller = Totaller(x)
            totaller.add(y) shouldBe expectedTotal

        }
    }

})

