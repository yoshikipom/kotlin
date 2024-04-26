import org.junit.jupiter.api.Test

// only can be put on top level
const val c = "const"

class MainTest {

    @Test
    fun variables() {
        val name: String = "hello"
        // name = "world" // impossible
        var varName = "hello"
        varName = "world"
        val nullableName: String? = null

        println("${name}, ${varName}, ${nullableName}, ${c},")
    }

    @Test
    fun collections() {
        val list = listOf(1, 2, 3)
        for (num in list) {
            println(num)
        }
        println(list.filter { it % 2 == 1 })

        val s = setOf(1, 2, 3, 1, 2, 3)
        println(s)

        val m = mapOf(1 to "a", 2 to "b", 3 to "c")
        for ((key, value) in m) {
            println("$key $value")
        }
        list.forEachIndexed { key, value ->
            println("$key $value")
        }

        for (i in 1..10) println(i)
        println(5 in 1..10)
    }

    @Test
    fun other() {
        println("ABC" is String)

        // cast as
    }

    class User(name: String) {
        val name = name
            get() = field
    }

}

