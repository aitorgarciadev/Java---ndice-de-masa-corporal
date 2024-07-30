package java.dev.aitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BMITest {

    @Test
    public void testCalculateBMI() {
        assertEquals(22.86, BMI.calculateBMI(70, 1.75), 0.01);
        assertEquals(19.53, BMI.calculateBMI(55, 1.68), 0.01);
        assertThrows(IllegalArgumentException.class, () -> {
            BMI.calculateBMI(70, 0);
        });
    }

    @Test
    public void testGetBMICategory() {
        assertEquals("Underweight", BMI.getBMICategory(17));
        assertEquals("Normal weight", BMI.getBMICategory(22));
        assertEquals("Overweight", BMI.getBMICategory(27));
        assertEquals("Obesity", BMI.getBMICategory(30));
    }
}
