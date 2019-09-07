import org.junit.Test;

import static org.junit.Assert.*;

public class NewtonLawsTest {

    @Test
    public void newton2nd1Test1() {
        double expected = 50;
        double actual = NewtonLaws.newton2nd1(10,5);
        assertEquals(expected,actual,0);
    }

    @Test
    public void newton2n2Test1() {
        double expected = 2;
        double actual = NewtonLaws.newton2n2(10,5);
        assertEquals(expected,actual,0);

    }

    @Test
    public void kelTest1() {
        double expected = 125.0;
        double actual = NewtonLaws.kel(10,5);
        assertEquals(expected,actual,0);

    }

    @Test
    public void kelmassTest1() {
        double expected = 10;
        double actual = NewtonLaws.kelmass(125,5);
        assertEquals(expected,actual,0);

    }

    @Test
    public void kelvTest1() {
        double expected = 5;
        double actual = NewtonLaws.kelv(125,10);
        assertEquals(expected,actual,0);

    }
}