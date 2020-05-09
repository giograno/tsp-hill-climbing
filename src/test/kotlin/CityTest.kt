import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CityTest {
    private val zurich = City("Zurich", 47.366667, 8.55)
    private val winterthur = City("Winterthur", 47.50564, 8.72413)

    @Test
    fun measureDistance() {
        var distance : Double = zurich.measureDistance(winterthur)
        Assertions.assertEquals(distance, 20.00, 3.0)
    }
}