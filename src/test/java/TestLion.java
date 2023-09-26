import com.example.Lion;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TestLion {
    public TestLion() throws Exception {
    }

    @BeforeEach
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
        Assertions.assertEquals(true, maleLion.doesHaveMane());
        Lion femaleLion = new Lion("Самка");
        Assertions.assertEquals(false, femaleLion.doesHaveMane());
    }
    @Test
    public void testInvalidSex() {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion invalidLion = new Lion("Неверное значение пола животного - должно быть 'Самец' или 'Самка'");
        });
    }
}