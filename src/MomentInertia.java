public class MomentInertia {
    //Methods to solve equations of I
    //point mass
    /**
     public static double MoI(double in[][], int numMasses){
     double moI;
     moI = 0.0;
     for(int i = 0; i<in.length; i++){
     moI=moI+(in[i][0]*in[i][1]);
     }
     return moI;
     }
     **/
    public static double MoI(double m, double r){
        double moI;
        moI = (m * r * r);
        return moI;
    }
    //Hoop around central axis
    public static double moIHc(double mass, double radius){
        double moI=mass*radius*radius;
        return moI;
    }
    //Ring around central axis
    public static double moIRi(double mass, double radius1, double radius2){
        double moI=.5*mass*(radius1*radius1+radius2*radius2);
        return moI;
    }
    //Cylinder around central axis
    public static double moICc(double mass, double radius){
        double moI=.5*mass*radius*radius;
        return moI;
    }
    //Cylinder around central diameter
    public static double moICd(double mass, double radius, double length){
        double moI=.25*mass*radius*radius+1/12*mass*length*length;
        return moI;
    }
    //Rod around central axis
    public static double moIR(double mass, double length){
        double moI=(1/12)*mass*length*length;
        return moI;
    }
    //Solid Sphere around central axis
    public static double moIS(double mass, double radius){
        double moI=(2/5)*mass*radius*radius;
        return moI;
    }
    //Hollow Sphere around central axis
    public static double moISh(double mass, double radius){
        double moI=(2/3)*mass*radius*radius;
        return moI;
    }
    //Hoop around diameter
    public static double moIHd(double mass, double radius){
        double moI=.5*mass*radius*radius;
        return moI;
    }
    //Slab around central axis
    public static double moISl(double mass, double a, double b){
        double moI=(mass/12)*(a*a*b*b);
        return moI;
    }
    //Method to find additional I via parallel axis theorum
    public static double pAxis(double mass, double h){
        double mh2 = mass*h*h;
        return mh2;
    }

}
