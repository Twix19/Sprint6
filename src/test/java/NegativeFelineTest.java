import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.List;


public class NegativeFelineTest {
    Feline feline = new Feline();
    @Test
    public void errorCountOfKittens(){
        Feline feline = new Feline();
        int kittenCount = feline.getKittens();
        if (kittenCount == 1) {
            System.out.println("Ошибка,есть 1 котёнок");
        }
    }
    @Test
    public void errorKindOfFamily(){
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();

        if(expectedFamily.equals(actualFamily)){
            System.out.println("Ожидалась другая семья");
        }
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птица", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }
}
