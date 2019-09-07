import org.junit.Test;

import static org.junit.Assert.*;

public class MomentInertiaTest {

    @Test
    public void moITest1() {
        double expected = 250;
        double actual = MomentInertia.MoI(10,5);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void moIHcTest1() {
        double expected = 250;
        double actual = MomentInertia.moIHc(10,5);
        assertEquals(expected, actual, 0);

    }

    @Test
    public void moIRiTest1() {
        double expected = 370.0;
        double actual = MomentInertia.moIRi(10,5,7);
        assertEquals(expected, actual, 0);
    }

    @Test
    //cylinder around central axis
    public void moICcTest1() {
        double expected = 125;
        double actual = MomentInertia.moICc(10,5);
        assertEquals(expected, actual, 0);
    }

    @Test
    //bhulll
    public void moICdTest1() {
        double expected = 92.5;
        double actual = MomentInertia.moICd(10,5,6);
        assertEquals(expected, actual, 0);
    }

    @Test
    //etao bhul
    public void moIRTest1() {
        double expected = 30;
        double actual = MomentInertia.moIR(10,6);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void moISTest1() {
        double expected = 144;
        double actual = MomentInertia.moIS(10,6);
        assertEquals(expected, actual, 0);
    }

    @Test

    public void moIShTest1() {
        double expected = 360;
        double actual = MomentInertia.moISh(10,6);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void moIHdTest1() {
        double expected = 125;
        double actual = MomentInertia.moIHd(10,5);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void moISl() {
        
    }

    @Test
    public void pAxis() {
    }
}