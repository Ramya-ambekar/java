
import java.util.Scanner;


 class Person {
	String name,addr,phno,email; 
	Person(String name,String addr,String phno, String email )
	{
		this.name=name;
		this.addr=addr;
		this.phno=phno;
		this.email=email;
	}

	void display()
	{
		System.out.println(this.name);
		System.out.println(this.addr);
		System.out.println(this.phno);
		System.out.println(this.email);
	}
}

class student extends Person implements student_op{
	String usn,branch;
	int sub1,sub2,sub3,total;
	student(String name,String addr,String phno,String email,String usn,String branch,int sub1,int sub2,int sub3)
	{
	super(name,addr,phno,email);
	this.usn=usn;
	this.branch=branch;
	this.sub1=sub1;
	this.sub2=sub2;
	this.sub3=sub3;
	this.total=this.calculate_marks();
	}
	void display()
	{
		super.display();
		System.out.println(this.usn);
                System.out.println(this.branch);
		System.out.println(this.total);
	}
	public int calculate_marks(){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.total=this.sub1+this.sub2+this.sub3;
		return this.total;
	}
}

class staff extends Person{
String company, empid, design ;
	 double sal;
	staff(String name, String addr, String phno, String email,String company,String design,String empid) {
		super(name,addr,phno, email);
		this.company=company;
		this.design=design;
		this.empid=empid;
		this.sal=calculate_sal();
	}
	void display()
        {
                super.display();
                System.out.println(this.company);
                System.out.println(this.design);
                System.out.println(this.empid);
		System.out.println(this.sal);
        }
	double calculate_sal()
	{
	this.sal=70000;
	return this.sal;
	}
}
public class Test{

	public static void main(String[] arg){

		Scanner sc=new Scanner(System.in);
		System.out.println("1-----Student");
		System.out.println("2-----Staff");
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		if(ch==1)
		{
		System.out.print("Enter your name : ");
		String name=sc.next();
		System.out.print("Enter  address: ");
		String addr=sc.next();
		System.out.print("Enter your phno: ");
		String phno=sc.next();
		System.out.print("Enter your email: ");
		String email=sc.next();
		System.out.print("Enter your usn: ");
		String usn=sc.next();
		System.out.print("Enter your branch: ");
		String branch=sc.next();
		System.out.println("----------------------");
		System.out.print("Enter subject1 marks: ");
		int sub1=sc.nextInt();
		System.out.print("Enter subject2 marks: ");
                int sub2=sc.nextInt();
		System.out.print("Enter subject3 marks: ");
                int sub3=sc.nextInt();
		student s1 = new student(name,addr,phno,email,usn,branch,sub1,sub2,sub3);
		s1.display();
		}
		else if(ch==2)
		{
		System.out.print("Enter your name : ");
                String name=sc.next();
                System.out.print("Enter  address: ");
                String addr=sc.next();
                System.out.print("Enter your phno: ");
                String phno=sc.next();
                System.out.print("Enter your email: ");
                String email=sc.next();
		System.out.print("Enter your company : ");
                String comp=sc.next();
		System.out.print("Enter your design : ");
                String design=sc.next();
		System.out.print("Enter your empid : ");
                String empid=sc.next();
		staff staff1=new staff(name,addr,phno,email,comp,design,empid);
		staff1.display();
		}

}
}
