import com.example.Cat;
import com.example.Predator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class CatTest {


 Predator predator = Mockito.mock(Predator.class);


    Cat cat = new Cat(predator);


    @Test
    public void getCatsSound() { //getSound
        String actual = cat.getSound() ;
        String expected = "Мяу";
        assertEquals(expected, actual);

    }



    @Test
    public void getCatFood() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}
