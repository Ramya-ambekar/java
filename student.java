import java.io.*;
import java.util.Scanner;

public class student
{
	Scanner sc=new Scanner(System.in);
	String usn=null;
	String name=null;
	String adr="",email="",branch="";

	student(String usn,String name,String adr,String email,String branch)
	{
	 this.usn=usn;
	 this.name=name;
	 this.adr=adr;
	 this.email=email;
	 this.branch=branch;
	}
	double calfees()
	{
		System.out.println("enter tution and exam fees");
		double tutionfees=sc.nextDouble();
		double examfees=sc.nextDouble();
		double total=tutionfees+examfees;
		return(total);

	}

	public static void main(String args[])
	{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student usn");
        String usn=sc.nextLine();
        System.out.println("Enter Student name");
        String name=sc.nextLine();
	System.out.println("Enter Student address");
        String adr=sc.nextLine();
	System.out.println("Enter Student email");
        String email=sc.nextLine();
	System.out.println("Enter Student branch");
        String branch=sc.nextLine();
	student st =new student(usn,name,adr,email,branch);
	System.out.println("-------------------------------------");
	System.out.println("Total is: "+st.calfees());
}

}
