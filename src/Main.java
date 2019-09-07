public class Main {
    public static void main(String[] args) {
        KineticEnergy k = new KineticEnergy();
        double  x= k.kinematics16(10,3,2);
        System.out.println(x);
        MomentInertia m = new MomentInertia();
        System.out.println(m.moIR(10,6));

    }
}
