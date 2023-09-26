import org.junit.Test;
import org.junit.Assert;
import com.example.Cat;
import com.example.Feline;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.Arrays;


public class NegativeCatTest {
    @Mock
    Feline feline = new Feline();
    @Test
    public void errorCatSound(){
        Cat cat = new Cat(feline);
        String catSound = cat.getSound();
        Assert.assertFalse("Тест провален: звук кота совпадает с ожидаемым Мяу",catSound != "Мяу" );
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
