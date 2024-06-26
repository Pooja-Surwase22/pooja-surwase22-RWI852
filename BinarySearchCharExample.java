public class BinarySearchCharExample {  
    public static void binarySearch(char arr[], int first, int last, char key) {  
        int mid = (first + last) / 2;  
        while (first <= last) {  
            if (arr[mid] < key) {  
                first = mid + 1;     
            } else if (arr[mid] == key) {  
                System.out.println("Element is found at index: " + mid);  
                break;  
            } else {  
                last = mid - 1;  
            }  
            mid = (first + last) / 2;  
        }  
        if (first > last) {  
            System.out.println("Element is not found!");  
        }  
    }  
    
    public static void main(String args[]) {  
        char arr[] = {'a', 'c', 'e', 'g', 'i', 'k', 'm', 'o', 'q', 's', 'u', 'w', 'y'};  
        char key = 'm';  
        int last = arr.length - 1;  
        binarySearch(arr, 0, last, key);     
    }  
}
