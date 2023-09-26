import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class NegativeCatTest {
    @Mock
    Feline feline = new Feline();
    @Test
    public void errorCatSound(){
        Cat cat = new Cat(feline);
        String catSound = cat.getSound();
        Assertions.assertFalse(catSound != "Мяу", "Тест провален: звук кота совпадает с ожидаемым Мяу");
    }
    @Test
    public void errorGetFoodTest() throws Exception{
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Фрукты", "Овощи"));
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
