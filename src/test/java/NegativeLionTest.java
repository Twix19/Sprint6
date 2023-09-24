import com.example.Lion;
import org.junit.Test;

public class NegativeLionTest {
    Lion lion = new Lion("Самец");

    public NegativeLionTest() throws Exception {
    }


    @Test
    public void errorCountOfKittens(){
        int expectedKittens = 2;
        int actualKittens = lion.getKittens();
        if(actualKittens == expectedKittens){
            System.out.println("Тест не пройден! Количество котят такое же, как и ожидалось: " + expectedKittens);
        } else {
            System.out.println("Тест не пройден! Количество котят такое же, как и ожидалось: " + expectedKittens);
        }
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
        try {
            Lion invalidLion = new Lion("Неверное значение пола животного - должно быть 'Самец' или 'Самка'");
            System.out.println("Ожидалась ошибка");
        } catch (Exception e) {
            // ожидаемая ошибка
            throw new Exception(e);
        }
    }

}
