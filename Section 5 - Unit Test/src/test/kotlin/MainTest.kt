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

}