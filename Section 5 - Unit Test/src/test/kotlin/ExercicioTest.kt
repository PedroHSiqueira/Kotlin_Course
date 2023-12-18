import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ExercicioTest {

    @Test
    @DisplayName("Teste Portaria")
    fun testPortaria(){
        Assertions.assertEquals(portaria(15,"",""), "Negado.")
        Assertions.assertEquals(portaria(20,"",""), "Negado.")
        Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.")

        Assertions.assertEquals(portaria(25, "comum", "xt56656"), "Welcome.")
        Assertions.assertEquals(portaria(25, "comum", "xl56656"), "Negado.")

        Assertions.assertEquals(portaria(25, "luxo", "xl56436"), "Welcome.")
        Assertions.assertEquals(portaria(25, "luxo", "xt56436"), "Negado.")

        Assertions.assertEquals(portaria(25, "premium", "xl56436"), "Welcome.")
        Assertions.assertEquals(portaria(25, "premium", "xt56436"), "Negado.")
    }
}