import kotlin.random.Random

class HillClimbing(private val iterationsPlateau: Int) {

    fun findShortestRoute(route: Route) : Route {
        var iterations = 0
        var currentRoute : Route = route
        var move : String

        while(iterations < iterationsPlateau) {
            var candidateRoute : Route = obtainAdjacentRoute(Route(currentRoute.cities.toMutableList()))
            if (candidateRoute.getTotalDistance() < currentRoute.getTotalDistance()) {
                currentRoute = candidateRoute
                iterations = 0
                move = "+++ $currentRoute - Distance: ${currentRoute.getTotalDistance().format(5)} \t"
            } else {
                iterations++
                move = "=== $currentRoute - Distance: ${currentRoute.getTotalDistance().format(5)} " +
                        "- To Stuck ${iterationsPlateau-iterations}"
            }
            println(message = move)
        }
        return currentRoute
    }

    private fun obtainAdjacentRoute(route: Route) : Route {
        var posOne = 0
        var posTwo = 0
        while (posOne == posTwo) {
            posOne = Random.nextInt(route.cities.size)
            posTwo = Random.nextInt(route.cities.size)
        }
        route.cities[posOne] = route.cities[posTwo].also { route.cities[posTwo] = route.cities[posOne]}
        return route
    }

    fun Double.format(digits: Int) = "%.${digits}f".format(this)
}