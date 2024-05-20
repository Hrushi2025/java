/*
 * Read product file and print all lines that contain product description like '%heese%'
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Loop23 {
    public static void main(String[] args) {
        // Path to the CSV file
        String filePath = "C:\\Users\\Admin\\PycharmProjects\\python\\venv\\DATA\\product.csv";

        // Read the CSV file and print lines containing '%heese%'
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                for (String column : columns) {
                    if (column.toLowerCase().contains("heese")) {
                        System.out.println(line);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
