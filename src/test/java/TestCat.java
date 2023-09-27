import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
public class TestCat {

    @BeforeAll
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline = new Feline();

    @Test
    public void catSound(){
        Cat cat = new Cat(feline);
        Assertions.assertEquals(cat.getSound(),"Мяу");
    }
   @Test
    public void getFoodTest() throws Exception{
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
