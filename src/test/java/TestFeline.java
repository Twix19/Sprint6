import com.example.Feline;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestFeline {
    Feline feline = new Feline();
    @Test
    public void countOfKittens(){
        assertEquals(feline.getKittens(),1);
    }
    @Test
    public void kindOfFamily(){
        assertEquals(feline.getFamily(),"Кошачьи");
    }
    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птица", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }
}

