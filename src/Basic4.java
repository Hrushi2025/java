/* "Write a programe to define a variable a=10 and b=20 and swap values of the variables. Output should display:
initial value of a is: <actual vaule of a> and initial value of b is: <actual value of b>
value of a after swap is: <actual vaule of a> and value of b after swap is: <actual value of b>
**** without using two variables"*/

public class Basic4  {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Printing initial values of a and b
        System.out.println("Initial value of a is: " + a + " and initial value of b is: " + b);
        
        // Swapping values without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        // Printing values after swap
        System.out.println("Value of a after swap is: " + a + " and value of b after swap is: " + b);
    }
}

    
  