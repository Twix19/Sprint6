import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class NegativeLionTest {
    Lion lion = new Lion("Самец");

    public NegativeLionTest() throws Exception {
    }
    @Test
    public void errorCountOfKittens(){
        Assert.assertFalse("Ошибка,есть 1 котёнок",lion.getKittens() != 1 );
    }
    @Test
    public void errorTestDoesHaveMane() throws Exception {
        Lion maleLion = new Lion("Самец");
        if (!maleLion.doesHaveMane()) {
            throw new AssertionError("Ошибка: Самец должен иметь гриву");
        }
        Lion femaleLion = new Lion("Самка");
        if (femaleLion.doesHaveMane()) {
            throw new AssertionError("Ошибка: Самка не должна иметь гриву");
        }
    }
    @Test(expected = Exception.class)
    public void testInvalidSex() throws Exception {
        Lion invalidLion = new Lion("Неверное значение пола животного - должно быть 'Самец' или 'Самка'");
    }
}
