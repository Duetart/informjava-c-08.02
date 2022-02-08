import java.util.Scanner;
public class Main {
    
    public static void fib(int a) {
        int[] arr = new int[a];
        for(int i = 0; i < a; i++) {
            if(i <= 1)
            arr[i] = 1;
            else {arr[i] = arr[i-1] + arr[i - 2];}
            System.out.print(arr[i] + " ");}}
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    fib(in.nextInt());}
}
