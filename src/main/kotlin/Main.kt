fun main() {
    var things = mutableListOf<String>("perro", "gato")

    for (each_thing in things) {
        println(each_thing)
    }

    things.forEach {
        println(it)
    }

    var dict = mutableMapOf <String, Float>("Darkest Dungeon 2" to 39.99f,
    "Elden Ring" to 59.99f)

    println(dict["Darkest Dungeon 2"])

    dict["Minecraft"] = 0.0f
    println("The map is $dict")

    dict.remove("Darkest Dungeon 2")
    println("Now the map is $dict")

    for ((key, value) in dict) {
        println("$key -> $value")
    }

    dict.forEach {
        println("${it.key} -> ${it.value}")
    }
}