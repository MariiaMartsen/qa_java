import com.example.Feline;
import org.junit.jupiter.api.Test;



import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline(); //IFeline
   // @Mock
   // Feline feline;


    @Test
    public void getWhatTypeOfMeatEatFeline() throws Exception { //eatMeat
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getWhatTheFamilyFelineBelongs() throws Exception { //getFamily
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensCountWithoutNumber() { // getKittens()
        int actual = feline.getKittens(); // вызвали проверяемый метод
        int expected = 1;
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void getKittensCountWithNumber() { //getKittens(par)
        int kittensCount = 9;
        int actual = feline.getKittens(kittensCount); // вызвали проверяемый метод
        int expected = 9;
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

}
