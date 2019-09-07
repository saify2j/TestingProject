public class AngularEquations {
    /*
     * Method set to convert linear kinematics values into angular values
     */
    //Converting displacement to theta
    public static double conversion1 (double radius, double displacement){
        double theta;
        theta = displacement / radius;
        return theta;
    }
    //Converting theta to displacement
    public static double conversion2 (double radius, double theta){
        double displacement;
        displacement = radius * theta;
        return displacement;
    }
    //Converting velocity to sigma
    public static double conversion3 (double radius, double velocity){
        double sigma;
        sigma = velocity / radius;
        return sigma;
    }
    //Converting sigma to velocity
    public static double conversion4 (double sigma, double radius){
        double velocity;
        velocity = sigma * radius;
        return velocity;
    }
    //Converting alpha to acceleration
    public static double conversion5 (double alpha, double radius){
        double acceleration;
        acceleration = alpha * radius;
        return acceleration;
    }
    //Converting acceleration to alpha
    public static double conversion6 (double acceleration, double radius){
        double alpha;
        alpha = acceleration / radius;
        return alpha;
    }

}
