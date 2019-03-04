package practice;
import java.util.Scanner;
public class Practice {
     double w;
     double h;
     double IdealMassWoman;
     double IdealMassMan;
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Введите ваш вес");
         double w = s.nextDouble();
    System.out.println("Введите ваш рост");
        double h = s.nextDouble();
        double IdealMassWoman =  h - 110;
        double IdealMassMan =  h - 100;
         System.out.println("Введите свой пол");
         System.out.println("1-Женщина");
         System.out.println("2-Мужчина");
        int sex = s.nextInt();
        switch (sex){
            case(1):
        if (w > IdealMassWoman) {
  System.out.println("Вам необходимо похудеть на "+(w-IdealMassWoman)+"кг");
        }
        else if (w<IdealMassWoman) {
  System.out.println("Вам необходимо поправиться на "+(IdealMassWoman-w)+"кг");
 }
        else  if (w == IdealMassWoman){
     System.out.println("Ваш вес оптимальный");
 }
        break;
        case (2):
        if (w > IdealMassMan) {
  System.out.println("Вам необходимо похудеть на "+(w-IdealMassMan)+"кг");
        }
        else if (w<IdealMassMan) {
  System.out.println("Вам необходимо поправиться на "+(IdealMassMan-w)+"кг");
 }
        else  if (w == IdealMassMan){
     System.out.println("Ваш вес оптимальный");
    }
  break; 
    }
}
}
