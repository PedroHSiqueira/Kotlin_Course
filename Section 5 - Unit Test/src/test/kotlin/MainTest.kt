import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste XXOO")
    fun testCountXO(){
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("ooxx"))}
        )
    }

    @Test
    @Disabled
    fun naoImplementado(){
        println("Disabled")
    }

    @Test
    fun vaiFalhar(){
        fail("Método Obrigatorio")
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxoo"))

        Assertions.assertTrue(abc())
    }

    @Test
    fun exception(){
        assertThrows<NullPointerException> { abc() }
    }
}