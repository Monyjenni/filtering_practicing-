fun main(args: Array<String>) {

    // Filtering by predicate

    //list filtering

    var numbers = listOf("one", "two", "three")

    // length uses for string only

    numbers = numbers.filter { it.length > 3 }


    println("numbers: ${numbers}")

    val numberInt = listOf(1,2,3,4,5)

    val greaterThan3 = numberInt.filter { it > 3 }

    println(" greaterThan3: ${greaterThan3} ")

    // map filtering

    val numberMap = mapOf("mony" to 1, "jen" to 2, "404" to 4, "jannie" to 4)
    val mapFilter = numberMap.filter { (key , value) -> key.endsWith("y") && value ==1 }

    println(" mapFilter: ${mapFilter} \n")


    val map1Filter = numberMap.filter { (key, value) -> key.startsWith("j") }

    println("map1filter${map1Filter} \n")

    // filterIndexed && filterNot

    val index = listOf("one", "two", "three", "four", "five")
    val filteredIndex = index.filterIndexed { index, s -> (index != 4) && (s.length == 3 )  }

    print("filteredIndex: ${filteredIndex} \n")

    val index1 = listOf("one", "two", "three", "four", "five")
    val filteredNot = index1.filterNot { it.length >= 3  }

    println("filteredNot: ${filteredNot} \n")



    val map2Filter = numberMap.filter{(key, value) -> value == 4 }

    println("map2Filter: ${map2Filter}\n")

    // filterIsInstace return collection elemenmt of a given type

    //Integer
    val mix = listOf("one", 2, "three", 4.0 )

    mix.filterIsInstance<Int>().forEach {
        println(it)
    }

    //Double
    mix.filterIsInstance<Double>().forEach {
        println(it)
    }
    //String
    mix.filterIsInstance<String>().forEach {
        println(it)
    }

    val numberList = listOf(null, 1, "two", 3.0, "four")



    numberList.filterIsInstance<String>().forEach {
        println(it.uppercase())
    }

    val nullList = listOf(null, "one", "two", null)
    nullList.filterNotNull().forEach {
        println(it.length)
    }

    val pairList = listOf("iconic","fantastic","woah","woww","amazee")
    val (match,rest)= pairList.partition { it.length <6 }
    println(match)
    println(rest)


    //Test predicates
    // here provide the boolean result
    val predicateList = listOf("mony","jennie","caroline","katara")
    println(predicateList.any{it.endsWith("y")})
    println(predicateList.none{it.startsWith("T")})
    println(predicateList.all{it.startsWith("m")})


}