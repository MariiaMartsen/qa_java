import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {

    @Test
    public void testCheckReturnNotBinarySex() { //doesHaveMane
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Самкамец");
            lion.doesHaveMane();
        });
    }

    @Test
    public void testCheckReturnMane () throws Exception { //doesHaveMane
        System.out.println("test");
        Lion lion = new Lion("Самец");
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);


    }



    @Test
    public void testCheckReturnFemale() throws Exception { //doesHaveMane
        Lion lion = new Lion("Самка");
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);

    }



    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void testCheckKittensCountForLionWithoutParameter(String sex) throws Exception { //getKittens
        Lion lion = new Lion(sex);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void testCheckKittensCountForLionWithParameter(String sex) throws Exception { //getKittens
        Lion lion = new Lion(sex);
        int actual = lion.getKittens(10);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void testCheckLionFamily(String sex) throws Exception { //getFamily
        Lion lion = new Lion(sex);
        String actual = lion.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void testCheckLionEat(String sex) throws Exception { //eatMeat
        Lion lion = new Lion(sex);
        List<String> actual = lion.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    }
