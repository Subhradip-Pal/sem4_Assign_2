package Assignment2A;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		al.add(90);
		al.add(96);
		al.add(50);
		al.add(256);
		al.add(125);
		System.out.println(al);
		System.out.println("Enter the number to search: ");
		int a=sc.nextInt();
		if(!al.isEmpty()) {
			System.out.println("Found= "+al.contains(a));
			System.out.println("Enter the index to delete: ");
			int i=sc.nextInt();
			System.out.println(al.remove(i));
			System.out.println(al);
		}
		else
			System.out.println("ArrayList is empty");
		
		

	}

}
