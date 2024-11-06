import java.util.Scanner;  
package fibonacci.sequence;
public class FibonacciSequence {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Nhap so luong phan tu Fibonacci ban muon in: ");  
        int n = scanner.nextInt();  
        if (n <= 0) {  
            System.out.println("So luong lon hon 0.");  
        } else if (n == 1) {  
            System.out.println("Day Fibonacci: 0");  
        } else {  
            System.out.print("Day Fibonacci: ");  
            int first = 0;   
            int second = 1;   
            System.out.print(first + ", " + second);     
            for (int i = 3; i <= n; i++) {   
                int next = first + second;   
                System.out.print(", " + next);  
                first = second;  
                second = next;  
            }  
            System.out.println(); 
        }  
            scanner.close();  
    }  
}  

    
    

