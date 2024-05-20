/*
 * Read product file and tran_dtl file and implement inner join using loops (use two for loops) 
 * -- implement left, right and full outer join
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Loop27{
    public static void main(String[] args) {
        String productFilePath = "C:\\\\Users\\\\Admin\\\\PycharmProjects\\\\python\\\\venv\\\\DATA\\\\product.csv";
        String tranDtlFilePath = "C:\\\\Users\\\\Admin\\\\PycharmProjects\\\\python\\\\venv\\\\DATA\\\\tran_dtl.csv";

        List<String[]> productList = readCSV(productFilePath);
        List<String[]> tranDtlList = readCSV(tranDtlFilePath);

        System.out.println("Left Join:");
        leftJoin(productList, tranDtlList);

        System.out.println("\nRight Join:");
        rightJoin(productList, tranDtlList);

        System.out.println("\nFull Outer Join:");
        fullOuterJoin(productList, tranDtlList);
    }

    private static List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                data.add(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private static void leftJoin(List<String[]> productList, List<String[]> tranDtlList) {
        for (String[] productRow : productList) {
            boolean foundMatch = false;
            for (String[] tranDtlRow : tranDtlList) {
                if (productRow.length > 0 && tranDtlRow.length > 0 &&
                        productRow[0].equals(tranDtlRow[0])) {
                    foundMatch = true;
                    System.out.print(String.join(",", productRow) + ",");
                    System.out.println(String.join(",", tranDtlRow));
                }
            }
            if (!foundMatch) {
                System.out.print(String.join(",", productRow) + ",");
                System.out.println("NULL,NULL,NULL");
            }
        }
    }

    private static void rightJoin(List<String[]> productList, List<String[]> tranDtlList) {
        for (String[] tranDtlRow : tranDtlList) {
            boolean foundMatch = false;
            for (String[] productRow : productList) {
                if (tranDtlRow.length > 0 && productRow.length > 0 &&
                        tranDtlRow[0].equals(productRow[0])) {
                    foundMatch = true;
                    System.out.print(String.join(",", productRow) + ",");
                    System.out.println(String.join(",", tranDtlRow));
                }
            }
            if (!foundMatch) {
                System.out.print("NULL,NULL,NULL,");
                System.out.println(String.join(",", tranDtlRow));
            }
        }
    }

    private static void fullOuterJoin(List<String[]> productList, List<String[]> tranDtlList) {
        for (String[] productRow : productList) {
            boolean foundMatch = false;
            for (String[] tranDtlRow : tranDtlList) {
                if (productRow.length > 0 && tranDtlRow.length > 0 &&
                        productRow[0].equals(tranDtlRow[0])) {
                    foundMatch = true;
                    System.out.print(String.join(",", productRow) + ",");
                    System.out.println(String.join(",", tranDtlRow));
                }
            }
            if (!foundMatch) {
                System.out.print(String.join(",", productRow) + ",");
                System.out.println("NULL,NULL,NULL");
            }
        }

        for (String[] tranDtlRow : tranDtlList) {
            boolean foundMatch = false;
            for (String[] productRow : productList) {
                if (tranDtlRow.length > 0 && productRow.length > 0 &&
                        tranDtlRow[0].equals(productRow[0])) {
                    foundMatch = true;
                    break;
                }
            }
            if (!foundMatch) {
                System.out.print("NULL,NULL,NULL,");
                System.out.println(String.join(",", tranDtlRow));
            }
        }
    }
}
