package homework14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class MainClassTest {
    private MainClass mainClass;

    @BeforeEach
    public void init() {
        mainClass = new MainClass();
    }

    @Test
    void testTask1ArrayEquals() {
        Assertions.assertArrayEquals(new int[]{3, 3, 1}, mainClass.getElementsBeforeLastNumberFour(new int[]{1, 8, 4, 5, 4, 3, 3, 1}));
    }

    @Test
    void testTask1TaskRuntimeException() {
        Assertions.assertThrows(RuntimeException.class,
                () -> mainClass.getElementsBeforeLastNumberFour(new int[]{1, 8, 3, 5, 3, 3, 3, 1}));
    }

    @Test
    void testTask1TaskNullPointerException() {
        Assertions.assertThrows(NullPointerException.class,
                () -> mainClass.getElementsBeforeLastNumberFour(null));
    }



    @Test
    void testTask2AssertTrue() {
        Assertions.assertTrue(mainClass.checkArrayContainOnlyOneAndFour(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    void testTask2AssertFalse() {
        Assertions.assertFalse(mainClass.checkArrayContainOnlyOneAndFour(new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }


    @Test
    void testTask2TaskNullPointerException() {
        Assertions.assertThrows(NullPointerException.class,
                () -> mainClass.checkArrayContainOnlyOneAndFour(null));
    }
}
