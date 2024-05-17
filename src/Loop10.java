/*
 * Read product file and tran_dtl file and implement inner join using loops (use two for loops) 
 * -- implement left, right and full outer join
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Loop10 {
    public static void main(String[] args) {
        // Simulated contents of product.txt
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "ProductA"));
        products.add(new Product(2, "ProductB"));
        products.add(new Product(3, "ProductC"));
        
        // Simulated contents of tran_dtl.txt
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1001, 1, 5));
        transactions.add(new Transaction(1002, 2, 3));
        transactions.add(new Transaction(1003, 1, 2));
        transactions.add(new Transaction(1004, 3, 7));
        transactions.add(new Transaction(1005, 4, 1));
        
        // Perform joins
        performInnerJoin(products, transactions);
        performLeftOuterJoin(products, transactions);
        performRightOuterJoin(products, transactions);
        performFullOuterJoin(products, transactions);
    }

    // Method to perform inner join
    public static void performInnerJoin(List<Product> products, List<Transaction> transactions) {
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
        System.out.println();
    }

    // Method to perform left outer join
    public static void performLeftOuterJoin(List<Product> products, List<Transaction> transactions) {
        System.out.println("Left Outer Join Result:");
        for (Product product : products) {
            boolean matchFound = false;
            for (Transaction transaction : transactions) {
                if (product.getProductId() == transaction.getProductId()) {
                    System.out.println("Transaction ID: " + transaction.getTransactionId() +
                                       ", Product ID: " + product.getProductId() +
                                       ", Product Name: " + product.getProductName() +
                                       ", Quantity: " + transaction.getQuantity());
                    matchFound = true;
                }
            }
            if (!matchFound) {
                System.out.println("Product ID: " + product.getProductId() +
                                   ", Product Name: " + product.getProductName() +
                                   ", Quantity: null");
            }
        }
        System.out.println();
    }

    // Method to perform right outer join
    public static void performRightOuterJoin(List<Product> products, List<Transaction> transactions) {
        System.out.println("Right Outer Join Result:");
        for (Transaction transaction : transactions) {
            boolean matchFound = false;
            for (Product product : products) {
                if (product.getProductId() == transaction.getProductId()) {
                    System.out.println("Transaction ID: " + transaction.getTransactionId() +
                                       ", Product ID: " + product.getProductId() +
                                       ", Product Name: " + product.getProductName() +
                                       ", Quantity: " + transaction.getQuantity());
                    matchFound = true;
                }
            }
            if (!matchFound) {
                System.out.println("Transaction ID: " + transaction.getTransactionId() +
                                   ", Product ID: " + transaction.getProductId() +
                                   ", Product Name: null" +
                                   ", Quantity: " + transaction.getQuantity());
            }
        }
        System.out.println();
    }

    // Method to perform full outer join
    public static void performFullOuterJoin(List<Product> products, List<Transaction> transactions) {
        System.out.println("Full Outer Join Result:");
        Set<Integer> matchedIds = new HashSet<>();

        // Left part
        for (Product product : products) {
            boolean matchFound = false;
            for (Transaction transaction : transactions) {
                if (product.getProductId() == transaction.getProductId()) {
                    System.out.println("Transaction ID: " + transaction.getTransactionId() +
                                       ", Product ID: " + product.getProductId() +
                                       ", Product Name: " + product.getProductName() +
                                       ", Quantity: " + transaction.getQuantity());
                    matchFound = true;
                    matchedIds.add(product.getProductId());
                }
            }
            if (!matchFound) {
                System.out.println("Product ID: " + product.getProductId() +
                                   ", Product Name: " + product.getProductName() +
                                   ", Quantity: null");
            }
        }

        // Right part
        for (Transaction transaction : transactions) {
            if (!matchedIds.contains(transaction.getProductId())) {
                System.out.println("Transaction ID: " + transaction.getTransactionId() +
                                   ", Product ID: " + transaction.getProductId() +
                                   ", Product Name: null" +
                                   ", Quantity: " + transaction.getQuantity());
            }
        }
        System.out.println();
    }
}

// Product class to represent a product record
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

// Transaction class to represent a transaction record
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

