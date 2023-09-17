import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import com.example.Feline;

public class TestLion  {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline = Mockito.mock(Feline.class);
    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion();
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "123"));
        lion.getFood();
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
    }
    Lion lion = new Lion();
    @Test
    public void countOfKittens(){
        Assert.assertEquals(lion.getKittens(),1);
    }
    @Test
    public void testDoesHaveMane() throws Exception {
        Lion maleLion = new Lion("Самец");
        Assert.assertEquals(true, maleLion.doesHaveMane());
        Lion femaleLion = new Lion("Самка");
        Assert.assertEquals(false, femaleLion.doesHaveMane());
    }

    @Test
    public void testInvalidSex() throws Exception {
        Lion invalidLion = new Lion("Используйте допустимые значения пола животного - самец или самка");
    }
}
