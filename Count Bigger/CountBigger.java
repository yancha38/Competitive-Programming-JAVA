import java.util.Scanner;

public class CountBigger {

	public static int countBigger(int[] num, int element) {
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] > element)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the no of elements: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the number: ");
		int num =s.nextInt();
		System.out.println("Result: " + countBigger(arr, num));
		s.close();
	}

}
