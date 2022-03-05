import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline(); //IFeline

    @Test
    public void testGetWhatTypeOfMeatEatFeline() throws Exception { //eatMeat
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Получен список еды несоответствующий семейству кошачьи", expected, actual);
    }

    @Test
    public void testGetWhatTheFamilyFelineBelongs() throws Exception { //getFamily
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Получено некорретное название семейства ", expected, actual);
    }

    @Test
    public void testGetKittensCountWithoutNumber() { // getKittens()
        int actual = feline.getKittens(); // вызвали проверяемый метод
        int expected = 1;
        assertEquals("Получено некорректное количество детенышей для метода без параметра", expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void testGetKittensCountWithNumber() { //getKittens(par)
        int kittensCount = 9;
        int actual = feline.getKittens(kittensCount); // вызвали проверяемый метод
        int expected = 9;
        assertEquals("Получено некорректное количество детенышей для метода с параметром", expected, actual); // сравнили ожидаемый результат с фактическим
    }
}
