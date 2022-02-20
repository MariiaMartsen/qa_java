import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


//@RunWith(MockitoJUnitRunner.class)
//@RunWith(Parameterized.class)
public class LionTest {



    @Test
    public void checkReturnMane () throws Exception { //doesHaveMane
        Lion lion = new Lion("Самец"); // "Самец"
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);

    }



    @Test
    public void checkReturnFemale () throws Exception { //doesHaveMane
        Lion lion = new Lion("Самка");
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    public void checkReturnNotBinarySex() { //doesHaveMane
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Самкамец");
            lion.doesHaveMane();
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void checkKittensCountForLionWithoutParameter(String sex) throws Exception { //getKittens
        Lion lion = new Lion(sex);
        int actual = lion.getKittens(); // вызвали проверяемый метод
        int expected = 1;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void checkKittensCountForLionWithParameter(String sex) throws Exception { //getKittens
        Lion lion = new Lion(sex);
        int actual = lion.getKittens(10); // вызвали проверяемый метод
        int expected = 10;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void checkLionFamily(String sex) throws Exception { //getFamily
        Lion lion = new Lion(sex);
        String actual = lion.getFamily(); // вызвали проверяемый метод
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void checkLionEat(String sex) throws Exception { //eatMeat
        Lion lion = new Lion(sex);
        List<String> actual = lion.eatMeat(); // вызвали проверяемый метод
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    }
