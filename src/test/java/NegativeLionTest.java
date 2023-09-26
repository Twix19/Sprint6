import com.example.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class NegativeLionTest {
    Lion lion = new Lion("Самец");

    public NegativeLionTest() throws Exception {
    }
    @Test
    public void errorCountOfKittens(){
        Assertions.assertFalse(lion.getKittens() != 1, "Ошибка,есть 1 котёнок");
    }
    @Test
    public void errorTestDoesHaveMane() throws Exception {
        Lion maleLion = new Lion("Самец");
        Assertions.assertTrue(maleLion.doesHaveMane(), "Ошибка: Самец должен иметь гриву");
        Lion femaleLion = new Lion("Самка");
        Assertions.assertFalse(femaleLion.doesHaveMane(), "Ошибка: Самка не должна иметь гриву");
    }

    @Test
    void testInvalidSex() {
        assertThrows(Exception.class, () -> {
            Lion invalidLion = new Lion("Неверное значение пола животного - должно быть 'Самец' или 'Самка'");
        });
    }
}


