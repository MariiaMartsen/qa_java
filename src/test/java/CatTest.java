import com.example.Cat;
import com.example.Predator;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CatTest {

 Predator predator = Mockito.mock(Predator.class);

    Cat cat = new Cat(predator);

    @Test
    public void testGetCatsSound() { //getSound
        String actual = cat.getSound() ;
        String expected = "Мяу";
        assertEquals("Получен некорректный звук для cat",expected, actual);
    }

    @Test
    public void testGetCatFood() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Получен некорректный список еды для cat", expected, actual);
    }
}
