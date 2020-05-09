class Route(var cities : MutableList<City>) {

    fun getTotalDistance() : Double {
        var totalDistance = 0.0
        for (i : Int in 0 until cities.size-1) {
            totalDistance += cities[i].measureDistance(cities[i+1])
        }
        totalDistance += cities[cities.size-1].measureDistance(cities[0])
        return totalDistance
    }

    override fun toString() : String {
        return "$cities"
    }
}