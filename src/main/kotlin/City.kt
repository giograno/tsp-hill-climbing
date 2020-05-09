import kotlin.math.*

class City(val name: String, var latitute: Double, var longitude: Double) {

    fun measureDistance(city: City): Double {
        return distance(latitute, city.latitute, longitude, city.longitude)
    }

    fun distance(lat1: Double, lat2: Double, lon1: Double, lon2: Double) : Double {
        val R = 6371 // Radius of the earth
        val latDistance = Math.toRadians(lat2 - lat1)
        val lonDistance = Math.toRadians(lon2 - lon1)
        val a = (sin(latDistance / 2) * sin(latDistance / 2)
                + (cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2))
                * sin(lonDistance / 2) * sin(lonDistance / 2)))
        val c = 2 * atan2(sqrt(a), sqrt(1 - a))
        var distance = R * c
        distance = distance.pow(2.0)
        return sqrt(distance)
    }

    override fun toString(): String {
        return name
    }
}