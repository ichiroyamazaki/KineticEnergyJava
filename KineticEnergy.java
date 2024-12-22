import java.util.Scanner;
public class KineticEnergy {
    public static double calKE(double m,double v){
        return (0.5*m*v*v);
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double mass,vel,ke;
        System.out.print("Enter mass in kilograms: ");
        mass = scan.nextDouble();
        System.out.print("Enter velocity in meter per second: ");
        vel = scan.nextDouble();
        ke = calKE(mass,vel);
        System.out.println("The object's kinetic energy is: " + String.format("%.2f",ke)+" J.");
    }
}
