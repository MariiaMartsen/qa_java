import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;

    public LionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getParameters() { //sex
        return new Object[][]{
                {"Самец"},
                {"Самка"}
        };
    }

    @Test(expected = Exception.class)
    public void testCheckReturnNotBinarySex() throws Exception { // ни самка, ни самец
            Lion lion = new Lion("Самкамец"); //
            lion.doesHaveMane();
        }

    @Test
    public void testCheckKittensCountForLionWithoutParameter() throws Exception {
        Lion lion = new Lion(sex);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals("Получено некорректное количество kittens без параметра", expected, actual);
    }

    @Test
    public void testCheckKittensCountForLionWithParameter() throws Exception { //getKittens
        Lion lion = new Lion(sex);
        int actual = lion.getKittens(10);
        int expected = 10;
        assertEquals("Получено некорректное количество kittens c параметром",expected, actual);
    }

    @Test
    public void testCheckReturnFemale() throws Exception { // проверка самки
        Lion lion = new Lion("Самка");
        boolean actual = lion.doesHaveMane();
        assertFalse("Ошибка с полом Самка", actual);
    }

    @Test
    public void testCheckReturnMane() throws Exception { //проверка самца
        Lion lion = new Lion("Самец");
        boolean actual = lion.doesHaveMane();
        assertTrue("Ошибка с полом Самец", actual);
    }
}









