

import java.io.FileInputStream;
import java.io.PrintStream;

public class task_2 {
    public static void main(String[] args) {
        
        try{
        
            try (FileInputStream inpStr = new FileInputStream("input.txt")) {
                int i = -1;
                // int j = 0;
                // int num[] = new int[2];
                while (( i = inpStr.read()) != -1){
                    System.out.print((char)i);
                 // Не доходит как преобразовать и воспользоватся данными из файла(   
                }
                
            }

        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        System.out.println();
        
        int b = 3;
        int a = 10;
        System.out.printf("Число %s в степени %s = %s", a, b, Math.pow(a, b));
        double x = Math.pow(a, b);

        try{
        
            try (PrintStream prStr = new PrintStream("output.txt")) {  // запись в файл
                prStr.println(x);
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
