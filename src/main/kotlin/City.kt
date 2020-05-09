import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.sin

class City(val name: String, var latitute: Double, var longitude: Double) {

    init {
        latitute = Math.toRadians(latitute)
        longitude = Math.toRadians(longitude)
    }

    fun measureDistance(city: City): Double {
        return distanceInKm(latitute, city.latitute, longitude, city.longitude)
    }
    private fun distanceInKm(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
        val theta : Double = lon1 - lon2
        var dist : Double = sin(deg2rad(lat1)) * sin(deg2rad(lat2)) +
                cos(deg2rad(lat1)) * cos(deg2rad(lat2)) * cos(deg2rad(theta))
        dist = acos(dist)
        dist = rad2deg(dist)
        dist *= 60 * 1.1515 * 1.609344
        return dist
    }

    private fun deg2rad(deg: Double): Double {
        return deg * Math.PI / 180.0
    }

    private fun rad2deg(rad: Double): Double {
        return rad * 180.0 / Math.PI
    }

    override fun toString(): String {
        return name
    }
}