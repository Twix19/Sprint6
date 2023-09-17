import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import com.example.Animal;

public class TestFeline {
    Feline feline = new Feline();
    @Test
    public void countOfKittens(){
        Assert.assertEquals(feline.getKittens(),1);
    }
    @Test
    public void kindOfFamily(){
        Assert.assertEquals(feline.getFamily(),"Кошачьи");
    }
    @Test
    public void kindOfEatingFood() throws Exception {
        Assert.assertEquals(feline.getFood("Хищник"), " Животные, Птицы, Рыба");
    }
}
