/*
 * Read product file and tran_dtl file and implement inner join using loops (use two for loops)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Loop26 {
    public static void main(String[] args) {
        
        String productFilePath = "C:\\Users\\Admin\\PycharmProjects\\python\\venv\\DATA\\product.csv";
        String tranDtlFilePath = "C:\\Users\\Admin\\PycharmProjects\\python\\venv\\DATA\\tran_dtl.csv";

        
        
                try {
                    BufferedReader productReader = new BufferedReader(new FileReader(productFilePath));
                    String productLine;
                    while ((productLine = productReader.readLine()) != null) {
                        
                        String[] productFields = productLine.split(",");
                        
                    
                        BufferedReader tranDtlReader = new BufferedReader(new FileReader(tranDtlFilePath));
                        String tranDtlLine;
                        while ((tranDtlLine = tranDtlReader.readLine()) != null) {
    
                            String[] tranDtlFields = tranDtlLine.split(",");
                            
    
                            if (productFields.length > 0 && tranDtlFields.length > 0 &&
                                productFields[0].equals(tranDtlFields[0])) {
                        
                                System.out.print(productLine + ","); 
                                System.out.println(tranDtlLine);    
                            }
                        }
                        tranDtlReader.close();
                    }
                    productReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        