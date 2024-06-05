import java.util.Scanner;

public class ArrayExample {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        // Input validation: check if the array size is non-negative
        if (n <= 0) {
            System.out.println("Invalid array size. Please enter a positive integer.");
            sc.close(); // Close the scanner object before exiting
            return; // Terminate the program
        }
        
        int[] a = new int[n];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Print the elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        
        // Close the scanner object to release resources
        sc.close();
    }
}
