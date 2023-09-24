import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.Arrays;


public class TestLion {
    public TestLion() throws Exception {
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Lion lion;
    @Test
    public void getFoodTest() throws Exception{
        Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
        Mockito.verify(lion).getFood();
    }

    @Test
    public void countOfKittens() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(lion.getKittens(), 1);
    }
    @Test
    public void testDoesHaveMane() throws Exception {
        Lion maleLion = new Lion("Самец");
        Assert.assertEquals(true, maleLion.doesHaveMane());
        Lion femaleLion = new Lion("Самка");
        Assert.assertEquals(false, femaleLion.doesHaveMane());
    }
    @Test(expected = Exception.class)
    public void testInvalidSex() throws Exception {
        Lion invalidLion = new Lion("Неверное значение пола животного - должно быть 'Самец' или 'Самка'");
    }
}