import java.util.Scanner;
public class Main {
    public static int del(int a) {
        int sum = 1;
        int del = 2;
        while (del * del <= a) {
            if (a % del == 0) {
                sum += del;
                if (a / del > del)
                sum += a / del;}
                del++;}
                return sum;}
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt(), b = in.nextInt();
    int temp = 0;
    for (int i = a ; i < b; i++) {
        int sum = del(i);
        for (int j = i; j < b + 1; j++) {
            if (sum == j && i != j) {
                int sum1 = del(j);
                if (sum1 == i) {
                    temp = 1;
                    System.out.println("(" + i + "," + j + ") ");}}}}
                    if (temp == 0) {
                        System.out.print(0);}}}
