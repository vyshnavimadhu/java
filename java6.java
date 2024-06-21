import java.util.*;
class Person
{
	String pname;
	String gender;
	String address;
	int age;
	Person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter gender:");
		gender=sc.next();
		System.out.println("Enter address:");
		address=sc.next();
		System.out.println("Enter age:");
		age=sc.nextInt();
	}
}
class Employee extends Person
{
	int empid;
	String cname;
	double salary;
	String quali;
	Employee()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		empid=sc2.nextInt();
		System.out.println("Enter company name:");
		cname=sc2.next();
		System.out.println("Enter employee salary:");
		salary=sc2.nextInt();
		System.out.println("Enter employee qualification:");
		quali=sc2.next();
	}
}
class Teacher extends Employee
{
	String department;
	String subject;
	int tid;
	Teacher()
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter Subject:");
		subject=sc3.next();
		System.out.println("Enter Department:");
		ddepartment=sc3.next();
		System.out.println("Enter Teacher id:");
		tid=sc3.nextInt();
	}
	void display()
	{
		System.out.println("............................");
		System.out.println("Name:"+pname);
		System.out.println("Gender:"+gender);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
		System.out.println("Id:"+empid);
		System.out.println("Company Name:"+cname);
		System.out.println("Qualification:"+qualification);
		System.out.println("Salary:"+salary);
		System.out.println("Department:"+department);
		System.out.println("Teacher Id:"+tid);
	}
}
class MultilevelInheritance
{
	public static void main(String args[])
	{
		int n;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter number of Employees:");
		n=sc1.nextInt();
		Teacher t[]=new Teacher [n];
		for (int i=0;i<n;i++)
		{ 
		    t[i]=new Teacher();
		}
		System.out.println("............................");
		System.out.println("............................");
		System.out.println("The details are..................");
		System.out.println("............................");
		for(int i=0;i<n;i++)
		{
		  t[i].display();
		}
	}
}









		