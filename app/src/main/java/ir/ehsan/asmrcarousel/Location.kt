package ir.ehsan.asmrcarousel

data class Location(
    val image:Int,
    val title:String,
    val subtitle:String,
    val rating:Int,
)

val locations = listOf(
    Location(
        image = R.drawable.tabriz,
        title = "Tabriz",
        subtitle = "A city in iran",
        rating = 5
    ),
    Location(
        image = R.drawable.dubai,
        subtitle = "A city in United Arab Emirates",
        rating = 3,
        title = "Dubai"
    ),
    Location(
        image = R.drawable.los_angeles,
        title = "Los Angeles",
        rating = 4,
        subtitle = "A sprawling Southern California city",
    ),
    Location(
        image = R.drawable.london,
        title = "London",
        rating = 3,
        subtitle = "Capital of England and the United Kingdom",
    ),
    Location(
        image = R.drawable.sweden,
        title = "Sweden",
        rating = 5,
        subtitle = "A beautiful country",
    ),
    Location(
        image = R.drawable.kazan,
        title = "Kazan",
        rating = 2,
        subtitle = "A city in russia",
    ),
)