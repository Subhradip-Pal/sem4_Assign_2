package Assignment2A;
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	int roll;
	String name;
	int age;
	double marks;
	Student(int roll,String name,int age,double marks){
		this.roll=roll;
		this.age=age;
		this.name=name;
		this.marks=marks;
	}
}

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> l=new LinkedList<Student>();
		l.add(new Student(12,"Rahul",20,100));
		l.add(new Student(22,"Manas",20,70));
		l.add(new Student(4,"Sarthak",30,10));
		l.add(new Student(35,"Me",19,90));
		//print
		for(Student e: l) {
			System.out.println(e.roll+" "+e.name+" "+e.age+" "+e.marks);
		}
		//search
		boolean flag=false;
		System.out.println("Enter the roll to search:");
		int r=sc.nextInt();
		for(Student e: l) {
			if(e.roll==r) {
				flag=true;
				System.out.println(e.roll+" "+e.name+" "+e.age+" "+e.marks);
			}
		}
		if(flag==false)
			System.out.println("DATA UNAVAILABLE");
		
		//delete
		flag=false;int c=0;
		System.out.println("Enter the roll to delete:");
		r=sc.nextInt();
		for(Student e: l) {
			if(e.roll==r) {
				flag=true;
				System.out.println(e.roll+" "+e.name+" "+e.age+" "+e.marks);
				l.remove(c);
			}
			c++;
		}
		if(flag==false)
			System.out.println("DATA UNAVAILABLE");
		
		//count size
		System.out.println("No. of student data= "+l.size());

	}

}
