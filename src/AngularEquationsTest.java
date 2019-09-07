import org.junit.Test;

import static org.junit.Assert.*;

public class AngularEquationsTest {

    @Test
    public void conversion1Test1() {
        double expected = 15.0;
        double actual= AngularEquations.conversion1(5,75);
        assertEquals(expected,actual,0);
    }

    @Test
    public void conversion2Test1() {
        double expected = 75.0;
        double actual= AngularEquations.conversion2(5,15);
        assertEquals(expected,actual,0);

    }

    @Test
    public void conversion3Test1() {
        double expected = 5.0;
        double actual= AngularEquations.conversion3(5,25);
        assertEquals(expected,actual,0);
    }

    @Test
    public void conversion4Test1() {
        double expected = 4.0;
        double actual= AngularEquations.conversion4(2,2);
        assertEquals(expected,actual,0);
    }

    @Test
    public void conversion5Test1() {
        double expected = 25.0;
        double actual= AngularEquations.conversion5(5,5);
        assertEquals(expected,actual,0);
    }

    @Test
    public void conversion6Test1() {
        double expected = 5.0;
        double actual= AngularEquations.conversion6(30,6);
        assertEquals(expected,actual,0);
    }
}