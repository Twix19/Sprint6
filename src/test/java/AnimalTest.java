import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.example.Animal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    Animal animal = new Animal();

    public AnimalTest() {
    }

    @ParameterizedTest
    @ValueSource(strings = {"Травоядное", "Хищник"})
    void testGetFood(String animalKind) throws Exception {
        Animal animal = new Animal();
        List<String> foodList = animal.getFood(animalKind);
        Assertions.assertNotNull(foodList);
        Assertions.assertFalse(foodList.isEmpty());
    }
    @Test
    public void haveOfFamily() {
        assertEquals(animal.getFamily(), "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }

}
