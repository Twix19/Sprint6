import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
public class TestCat {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline = new Feline();

    @Test
    public void catSound(){
        Cat cat = new Cat(feline);
        Assert.assertEquals(cat.getSound(),"Мяу");
    }
   @Test
    public void getFoodTest() throws Exception{
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
