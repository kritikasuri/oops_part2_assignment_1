import java.util.Scanner;

public class reverse_array {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of the array : ");
	    int size = scan.nextInt();
	    
	    System.out.println("Enter the elements of the array : ");
		int arr[]=new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Reverse elements of the array : ");
		for (int i = size-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
