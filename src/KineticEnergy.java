/**
 * @author heynderickxd
 * @author2 vannc
 */
import java.util.Scanner;
public class KineticEnergy {
    /**set of methods for dealing with kinematic equations
     * Note that the methods can be used for both linear and angular kinematics
     * problems.
     * Simply substitute like this:
     * displacement = theta
     * initial velocity = sigma_o (w thing?)
     * final velocity = sigma_f
     * acceleration = alfa
     */
    //methods for first kinematic equation (x=1/2*a*t^2 + v_ot)
    // solving for acceleration
    public static double kinematics1 (double displacement, double time,
                                      double initialVelocity) {
        double acceleration;
        acceleration = (displacement - (initialVelocity * time)) / Math.pow(time,2.0);
        return acceleration;
    }
    // solving for displacement
    public static double kinematics2 (double acceleration, double time,
                                      double initialVelocity) {
        double displacement;
        displacement = (0.5 * acceleration * Math.pow(time, 2.0)) +
                (initialVelocity * time);
        return displacement;
    }
    //solving for t
    public static double kinematics14(double x, double a, double Vo){
        double t;
        double vF;
        vF = kinematics7(x, a, Vo);
        t = kinematics6(vF, a, Vo);
        return t;
    }
    //solving for vO
    public static double kinematics16(double x, double a, double t){
        double vO;
        vO = (x - (a * t * t / 2)) / t;
        return vO;
    }
    //methods for second kinematic equation (v_f=v_o + at
    //solving for final velocity
    public static double kinematics3 (double initialVelocity, double time,
                                      double acceleration) {
        double finalVelocity = initialVelocity + (time * acceleration);
        return finalVelocity;
    }
    //solving for initial velocity
    public static double kinematics4 (double finalVelocity, double time,
                                      double acceleration){
        double initialVelocity;
        initialVelocity = finalVelocity - (time * acceleration);
        return initialVelocity;
    }
    //solving for acceleration
    public static double kinematics5 (double finalVelocity, double time,
                                      double initialVelocity) {
        double acceleration;
        acceleration = (finalVelocity - initialVelocity) / time;
        return acceleration;
    }
    //solving for time
    public static double kinematics6 (double finalVelocity, double acceleration,
                                      double initialVelocity) {
        double time = (finalVelocity - initialVelocity) / acceleration;
        return time;
    }
    //methods for third kinematic equation (v_f^2=v_o^2 + 2ax)
    //solving for final velocity
    public static double kinematics7 (double displacement, double acceleration,
                                      double initialVelocity) {
        double finalVelocity;
        finalVelocity = Math.sqrt(Math.pow(initialVelocity, 2.0) +
                (2 * acceleration * displacement));
        return finalVelocity;
    }
    //solving for initial velocity
    public static double kinematics8 (double displacement, double acceleration,
                                      double finalVelocity){
        double initialVelocity;
        initialVelocity = Math.sqrt(Math.pow(finalVelocity, 2.0) -
                (2 * acceleration * displacement));
        return initialVelocity;
    }
    // solving for displacement
    public static double kinematics9 (double initialVelocity, double acceleration,
                                      double finalVelocity){
        double displacement;
        displacement = (Math.pow(finalVelocity, 2.0) - Math.pow(initialVelocity, 2.0))
                / (2 * acceleration);
        return displacement;
    }
    // solving for acceleration
    public static double kinematics10 (double initialVelocity, double displacement,
                                       double finalVelocity){
        double acceleration;
        acceleration = (Math.pow(finalVelocity, 2.0) - Math.pow(initialVelocity, 2.0))
                / (2 * displacement);
        return acceleration;
    }
    //methods for fourth kinematic equation (x=v_ft-1/2at^2)
    //solving for displacement
    public static double kinematics11 (double vf, double a, double t){
        double x;
        x = (vf * t) - (0.5 * a * t * t);
        return x;
    }
    //solving for v_f
    public static double kinematics12 (double x, double a, double t){
        double vf;
        vf = (x + (0.5 * a * t * t)) / t;
        return vf;
    }
    //solving for a
    public static double kinematics13 (double x, double t, double vf){
        double a;
        a = ((x - (vf * t)) * (-2.0)) / (t * t);
        return a;
    }
    //solving for t
    public static double kinematics15 (double x, double vF, double a){
        double t;
        double vO;
        vO = kinematics8(x, a, vF);
        t = kinematics6(vF, a, vO);
        return t;
    }

    /*
    public static boolean inTest(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     try {
     Double.parseDouble(s);
     } catch (NumberFormatException e) {
     return false;
     }
     return true;
     }
    */
    public static boolean inTest(String in){
        try {
            Double.parseDouble(in);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

