/*
 * Read Product File and print alternate line from the file.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Loop24 {
    public static void main(String[] args) {
        
        String filePath = "C:\\\\Users\\\\Admin\\\\PycharmProjects\\\\python\\\\venv\\\\DATA\\\\product.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String headerLine = br.readLine(); 
            if (headerLine != null) {
                System.out.println(headerLine); 
                boolean printLine = false; 
                while ((line = br.readLine()) != null) {
                    if (printLine) {
                        System.out.println(line);
                    }
                    printLine = !printLine; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
