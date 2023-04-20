package Assignment2A;

import java.util.Scanner;
import java.util.Stack;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> binary=new Stack<>();
		System.out.println("Enter a decimal number: ");
		int n=sc.nextInt();
		while(n>0) {
			binary.push(n%2);
			n=n/2;
		}
		while(!binary.isEmpty()) {
			System.out.print(binary.pop());
		}
		

	}

}
