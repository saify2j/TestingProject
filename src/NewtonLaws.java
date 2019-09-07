public class NewtonLaws {
    /**
     * A set of methods to handle formulas involving Newton's Second Law
     * Can be used for both linear and angular applications, where
     * netForce = sumTorques
     * mass = moment of inertia (I)
     * acceleration = alpha
     */
    //Solving for netForce
    public static double newton2nd1 (double acceleration, double mass){
        double netForce;
        netForce = mass * acceleration;
        return netForce;
    }
    //solving for mass or acceleration, depending on which parameter is entrered
    //can swith mass with acceleration to find the opposite one
    public static double newton2n2 (double netForce, double mass){
        double acceleration;
        acceleration = netForce / mass;
        return acceleration;
    }
    //Methods to solve Knetic Energy equations ke=1/2mv^2 or ke=1/2Iw^2
    //Solve for ke
    public static double kel(double mass, double v){
        double ke;
        ke = 0.5*mass*v*v;
        return ke;
    }
    //solve for m or I
    public static double kelmass(double energy, double v){
        double mass;
        mass = 2*energy/v/v;
        return mass;
    }
    //solve for v or w
    public static double kelv(double energy, double mass){
        double v;
        v = Math.sqrt(2*energy/mass);
        return v;
    }


}
