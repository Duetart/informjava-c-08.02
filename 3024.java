import java.util.Scanner;
public class Main {
    public static double len (double x1, double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));}
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            double a1 = in.nextDouble();
            double b1 = in.nextDouble();
            double a2 = in.nextInt();
            double b2 = in.nextDouble();
            double a3 = in.nextDouble();
            double b3 = in.nextDouble();
            System.out.println(len(a1,b1,a2,b2)+len(a2,b2,a3,b3)+len(a3,b3,a1,b1));}}
