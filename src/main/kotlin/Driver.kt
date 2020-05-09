fun main() {
    var cities : MutableList<City> = mutableListOf()
    cities.add(City("Zurich", 47.366667, 8.55))
    cities.add(City("Uster", 47.352097, 8.716687))
    cities.add(City("Pfäffikon",47.365728, 8.78595))
    cities.add(City("Horgen", 47.255924, 8.598672))
    cities.add(City("Bülach", 47.518898, 8.536967))
    cities.add(City("Bad Zurzach", 47.589169, 8.289621))
    cities.add(City("Baden", 47.478029, 8.302764))
    cities.add(City("Zug", 47.172421, 8.517445))
    cities.add(City("Schaffhausen", 47.697316, 8.634929))
    cities.add(City("Winterthur", 47.50564, 8.72413))
    cities.shuffle()

    var startingRoute = Route(cities)
    println("=>> Initial Route $startingRoute")
    var hillClimbing = HillClimbing(50)
    hillClimbing.findShortestRoute(startingRoute)
}