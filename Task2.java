
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class Task2 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("input.txt")) {
            char[] buf = new char[4];
            int c;
            while ((c = reader.read(buf)) > 0) {

                if (c < 4) {
                    buf = Arrays.copyOf(buf, c);
                    String num = String.valueOf(buf);
                    System.out.println(num);

                }

                // System.out.print(buf);
                // int ch[]= Integer.parseUnsignedInt(num);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int b = 3;
        int a = 10;
        System.out.printf("Число %s в степени %s = %s", a, b, Math.pow(a, b));
        double x = Math.pow(a, b);

        try{
                try (PrintStream prStr = new PrintStream("output.txt")) {  // запись в файл
                prStr.println(x); 
            }

        } catch (Exception ex){
            System.out.println (ex.getMessage());
        }
    }
}
        

    
