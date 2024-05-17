import java.util.ArrayList;
import java.util.List;

public class Loop8 {

    public static void main(String[] args) {
    
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "ProductA"));
        products.add(new Product(2, "ProductB"));
        products.add(new Product(3, "ProductC"));
        
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1001, 1, 5));
        transactions.add(new Transaction(1002, 2, 3));
        transactions.add(new Transaction(1003, 1, 2));
        transactions.add(new Transaction(1004, 3, 7));
        transactions.add(new Transaction(1005, 4, 1));
        
        System.out.println("Inner Join Result:");
        for (Product product : products) {
            for (Transaction transaction : transactions) {
                if (product.getProductId() == transaction.getProductId()) {
                    System.out.println("Transaction ID: " + transaction.getTransactionId() +
                                       ", Product ID: " + product.getProductId() +
                                       ", Product Name: " + product.getProductName() +
                                       ", Quantity: " + transaction.getQuantity());
                }
            }
        }
    }
}


class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}

class Transaction {
    private int transactionId;
    private int productId;
    private int quantity;

    public Transaction(int transactionId, int productId, int quantity) {
        this.transactionId = transactionId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}

