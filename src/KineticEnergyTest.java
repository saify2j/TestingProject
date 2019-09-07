import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

public class KineticEnergyTest {

    @org.junit.Test
    public void kinematics1Test1() {
        double expected = 1.0;
        double actual = KineticEnergy.kinematics1(8,2,2);
        assertEquals(expected,actual,0);
    }
    @org.junit.Test
    //testing invalid inputs for d n t
    public void kinematics1Test2() {
        double expected = 0.0;
        double actual = KineticEnergy.kinematics1(-8,-2,2);
        assertEquals(expected,actual,0);
    }
    @org.junit.Test
    public void kinematics1Test3() {
        double expected = NaN;
        double actual = KineticEnergy.kinematics1(Double.MAX_VALUE,Double.MAX_VALUE,Double.MAX_VALUE);
        assertEquals(expected,actual,0);
    }
    @org.junit.Test
    public void kinematics1Test4() {
        double expected = NaN;
        double actual = KineticEnergy.kinematics1(Double.MAX_VALUE,Double.MAX_VALUE,Double.MAX_VALUE);
        assertEquals(expected,actual,0);
    }

    @Test
    public void kinematics2Test1() {

        double expected = 14.0;
        double actual = KineticEnergy.kinematics2(5,2,2);
        assertEquals(expected,actual,0);


    }
    @Test
    //invalid input test1
    public void kinematics2Test2() {

        double expected = -Double.MAX_VALUE;
        double actual = KineticEnergy.kinematics2(5,-2,2);
        assertEquals(expected,actual,0);


    }
    @Test
    //invalid input test2
    public void kinematics2Test3() {

        double expected = -Double.MAX_VALUE;
        double actual = KineticEnergy.kinematics2(0,-2,2);
        assertEquals(expected,actual,0);


    }

    @Test
    public void kinematics14Test1() {
        double expected = 2.0/3.0;
        double actual = KineticEnergy.kinematics14(4,3,5);
        assertEquals(expected,actual,0);


    }

    @Test
    public void kinematics16Test1() {
        double expected = 2.0;
        double actual = KineticEnergy.kinematics16(10,3,2);
        assertEquals(expected,actual,0);
    }

    @Test

    public void kinematics3Test1() {
        double expected = 11.0;
        double actual = KineticEnergy.kinematics3(5,3,2);
        assertEquals(expected,actual,0);
    }

    @Test
    public void kinematics4Test1() {
        double expected = 5.0;
        double actual = KineticEnergy.kinematics4(11,2,3);
        assertEquals(expected,actual,0);
    }

    @Test
    public void kinematics5Test1() {
        double expected = 3.0;
        double actual = KineticEnergy.kinematics5(11,2,5);
        assertEquals(expected,actual,0);

    }

    @Test
    public void kinematics6Test1() {
        double expected = 2.0;
        double actual = KineticEnergy.kinematics6(11,3,5);
        assertEquals(expected,actual,0);
    }

    @Test
    //test for valid input v_o=5,s= 4,a = 3, expectd= 7
    public void kinematics7test1() {
        double expected = 7.0;
        double actual = KineticEnergy.kinematics7(4,3,5);
        assertEquals(expected,actual,0);
    }

    @Test
    //test for valid input vF=7, s= 3, a =4 makes exp = 5
    public void kinematics8test1() {
        double expected = 5.0;
        double actual = KineticEnergy.kinematics8(3,4,7);
        assertEquals(expected,actual,0);
    }

    @Test
    //test for valid input vF= 10 ,v0 = 5 , a =2.5
    public void kinematics9Test1() {
        double expected = 15.0;
        double actual = KineticEnergy.kinematics9(5,2.5,10);
        assertEquals(expected,actual,0);
    }

    @Test
    public void kinematics10Test1() {
        double expected = 2.5;
        double actual = KineticEnergy.kinematics10(5,15,10);
        assertEquals(expected,actual,0);


    }

    @Test
    public void kinematics11Test1() {

        double expected = 24.0;
        double actual = KineticEnergy.kinematics11(10,2,4);
        assertEquals(expected,actual,0);

    }

    @Test
    public void kinematics12Test1() {
        double expected = 10.0;
        double actual = KineticEnergy.kinematics12(24,2,4);
        assertEquals(expected,actual,0);

    }

    @Test
    public void kinematics13Test1() {
        double expected = 2.0;
        double actual = KineticEnergy.kinematics13(24.0,4,10);
        assertEquals(expected,actual,0);

    }

    @Test
    public void kinematics15Test1() {

        double expected = 4.0;
        double actual = KineticEnergy.kinematics15(24.0,10,2);
        assertEquals(expected,actual,0);

    }
}