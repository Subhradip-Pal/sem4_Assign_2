package Assignment2B;

import java.util.Scanner;
import java.util.TreeSet;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(5);
		ts.add(3);
		System.out.println(ts);
		System.out.println("Enter the number to search: ");
		int a=sc.nextInt();
		System.out.println("Found= "+ts.contains(a));
		System.out.println("Enter the number to remove: ");
		a=sc.nextInt();
		System.out.println("Element deleted= "+ts.remove(a));
		System.out.println(ts);
	}

}
