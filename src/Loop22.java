/*
 * Read product file and print all the lines where cost is greater than 3.0
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Loop22 {
    public static void main(String[] args) {
        // Path to the CSV file
        String filePath = "C:\\\\Users\\\\Admin\\\\PycharmProjects\\\\python\\\\venv\\\\DATA\\\\product.csv";

        // Read the CSV file and print lines where cost is greater than 3.0
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String headerLine = br.readLine(); // Read the header line
            if (headerLine != null) {
                System.out.println(headerLine); // Print the header line
                int costIndex = getColumnIndex(headerLine, "cost");

                while ((line = br.readLine()) != null) {
                    String[] columns = line.split(",");
                    try {
                        double cost = Double.parseDouble(columns[costIndex]);
                        if (cost > 3.0) {
                            System.out.println(line);
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Error: Invalid cost value in line: " + line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getColumnIndex(String headerLine, String columnName) {
        String[] headers = headerLine.split(",");
        for (int i = 0; i < headers.length; i++) {
            if (headers[i].trim().equalsIgnoreCase(columnName)) {
                return i;
            }
        }
        return -1; 
    }
}
