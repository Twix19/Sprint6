import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import com.example.Animal;
import java.util.List;


import static org.junit.Assert.assertEquals;


public class TestFeline {
    Feline feline = new Feline();
    @Test
    public void countOfKittens(){
        assertEquals(feline.getKittens(),1);
    }
    @Test
    public void kindOfFamily(){
        assertEquals(feline.getFamily(),"Кошачьи");
    }
    @Test
    public void testEatMeat() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals("Животные", food.get(0));
    }
}
