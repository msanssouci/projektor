package projektor.parser.coverage.model

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import java.math.BigDecimal
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class CoverageReportStatSpec : StringSpec({
    "should calculate total and percent covered"() {
        forAll(
                row(50, 50, 100, BigDecimal("50.00")),
                row(33, 66, 99, BigDecimal("33.33")),
                row(60, 0, 60, BigDecimal("100.00"))
        ) { covered, missed, expectedTotal, expectedPercentCovered ->
            val coverageStat = CoverageReportStat(covered = covered, missed = missed)

            expectThat(coverageStat) {
                get { total }.isEqualTo(expectedTotal)
                get { percentCovered }.isEqualTo(expectedPercentCovered)
            }
        }
    }
})
