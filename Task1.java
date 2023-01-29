// +Написать программу вычисления n-ого треугольного числа. url

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n-ый элемент равен = ");
        int n = iScanner.nextInt();
        int t = 0;
        t = (n * (n + 1)) / 2;
        System.out.printf("%s-ое треугольное число = %s", n, t);
        iScanner.close();
    }    
}
