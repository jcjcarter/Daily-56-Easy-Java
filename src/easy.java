import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class easy {
    public static void main(String[] args) {
        char c = 97;
        foo("", c);
    }
    public static void foo(String s, char c) {
        if (c < 123) {
            foo(new String(s + c + s), ++c);
        } else {
            try {
                PrintWriter file = new PrintWriter(new File("056easy.txt"));
                file.println(s);
                file.close();
            } catch (FileNotFoundException e) {
                System.err.println("Error creating file: " + e.getMessage());
            }
            return;
        }
    }
}