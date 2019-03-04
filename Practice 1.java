package practice;
import java.util.Scanner;
public class Practice {
     double w;
     double h;
     double IdealMassWoman;
     double IdealMassMan;
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter weight");
         double w = s.nextDouble();
    System.out.println("Enter height");
        double h = s.nextDouble();
        double IdealMassWoman =  h - 110;
        double IdealMassMan =  h - 100;
        System.out.println("IdealMassWoman="+IdealMassWoman);
        System.out.print("IdealMassMan="+IdealMassMan); 
    }
}
