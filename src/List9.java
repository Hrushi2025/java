public class List9 {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Please provide exactly two strings as command line arguments.");
            return;
        }

        String firstString = args[0];
        String secondString = args[1];

    
        boolean isSubset = isSubset(firstString, secondString);

        if (isSubset) {
            System.out.println("The second string is a subset of the first string.");
        } else {
            System.out.println("The second string is not a subset of the first string.");
        }
    }

    public static boolean isSubset(String str1, String str2) {
        int[] charCount = new int[256]; 

    
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

    
        for (int j = 0; j < str2.length(); j++) {
            if (--charCount[str2.charAt(j)] < 0) {
                return false; 
            }
        }

        return true; 
    }
}
