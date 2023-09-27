import com.example.Feline;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class NegativeFelineTest {
    Feline feline = new Feline();
    @Test
    public void errorCountOfKittens(){
        Feline feline = new Feline();
        int kittenCount = feline.getKittens();
        Assertions.assertFalse(kittenCount != 1, "Ошибка,есть 1 котёнок");
    }
    @Test
    public void errorKindOfFamily(){
        Feline feline = new Feline();
        String felineFamily = feline.getFamily();
        Assertions.assertFalse(felineFamily != "Кошачьи", "Ожидалась другая семья");
    }
    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птица", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }
}
