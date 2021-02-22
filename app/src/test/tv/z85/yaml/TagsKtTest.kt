package tv.z85.yaml

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals


object YamlSpek : Spek({
    describe(" An empty document ") {
        val doc = yaml { }

        it("should return an empty string") {
            val result = doc.dump()

            assertEquals("", result)
        }
    }

    describe("A sequence") {
        describe("of scalars"){
            it("should dump each starting with -") {

                val doc = yaml {
                    seq {
                        + "Mark McGwire"
                        + "Sammy Sosa"
                        + "Ken Griffey"
                    }
                }

                val result = doc.dump()
                val expectedResult = """
                    - Mark McGwire
                    - Sammy Sosa
                    - Ken Griffey
                """.trimIndent()
                assertEquals(expectedResult, result)
            }
        }

        describe("of mapping") {
            it("should look like") {
                val result = yaml {
                    seq {
                        map {
                            "name" to "Mark McGwire"
                            "hr" to "65"
                            "avg" to "0.278"
                        }
                        map {
                            "name" to "Sammy Sosa"
                            "hr" to "63"
                            "avg" to "0.288"
                        }
                    }
                }.dump()

                val expectedResult = """
                    -
                      name: Mark McGwire
                      hr: 65
                      avg: 0.278
                    -
                      name: Sammy Sosa
                      hr: 63
                      avg: 0.288
                """.trimIndent()

                assertEquals(expectedResult, result)
            }
        }

        describe("of compact nested mapping"){
            it("should be like") {
                val result = yaml {
                    seq(Style.Compact) {
                        map {
                            "item" to "Super Hoop"
                            "quantity" to "1"
                        }
                        map {
                            "item" to "Basketball"
                            "quantity" to "4"
                        }
                        map {
                            "item" to "Big Shoes"
                            "quantity" to "1"
                        }
                    }
                }.dump()

                val expectedResult = """
                    - item: Super Hoop
                      quantity: 1
                    - item: Basketball
                      quantity: 4
                    - item: Big Shoes
                      quantity: 1
                """.trimIndent()

                assertEquals(expectedResult, result)
            }
        }
    }

    describe("A mapping") {
        describe("of scalar to scalar") {
            it("should separate them with :") {
                val result = yaml {
                    "hr" to "65"
                    "avg" to "0.278"
                    "rbi" to "147"
                }.dump()

                val expectedResult =
                    """
                        hr: 65
                        avg: 0.278
                        rbi: 147
                    """.trimIndent()

                assertEquals(expectedResult, result)
            }
        }
        describe("of scalars to sequence"){
            it("should be like"){
                val result = yaml {
                    "american" to_seq {
                        + "Boston Red Sox"
                        + "Detroit Tigers"
                        + "New York Yankees"
                    }

                    "national" to_seq {
                        + "New York Mets"
                        + "Chicago Cubs"
                        + "Atlanta Braves"
                    }
                }.dump()

                val exceptedResult = """
                    american:
                      - Boston Red Sox
                      - Detroit Tigers
                      - New York Yankees
                    national:
                      - New York Mets
                      - Chicago Cubs
                      - Atlanta Braves
                """.trimIndent()

                assertEquals(exceptedResult, result)
            }
        }
    }
})