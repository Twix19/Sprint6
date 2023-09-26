import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.List;


public class NegativeFelineTest {
    Feline feline = new Feline();
    @Test
    public void errorCountOfKittens(){
        Feline feline = new Feline();
        int kittenCount = feline.getKittens();
        Assert.assertFalse("Ошибка,есть 1 котёнок",kittenCount != 1 );
    }
    @Test
    public void errorKindOfFamily(){
        Feline feline = new Feline();
        String felineFamily = feline.getFamily();
        Assert.assertFalse("Ожидалась другая семья",felineFamily != "Кошачьи" );
    }
    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птица", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }
}
