import java.util.Scanner;

public class program1b {
	String name, stud_add, stud_phoneno, stud_emailid, branch;
	double tfees, ad_fee, tution_fees, fee1;
	static String college, address, phoneno;
	static {
		college = "RVCE";
		address = "Bengaluru";
		phoneno = "1234567890";
		}

	program1b(String name2, String add, String phoneno2, String emailid2, String branch2) {
		this.name = name2;
		this.stud_add = add;
		this.stud_phoneno = phoneno2;
		this.stud_emailid = emailid2;
		this.branch = branch2;
	}

	program1b(String name2, String add, String branch2) {
		this.name = name2;
		this.stud_add = add;
		this.stud_phoneno = phoneno;
		this.stud_emailid = "" + name + "@rvce.edu.in";
		this.branch = branch2;
	}

	public double fee(String branch2) {
		this.ad_fee = 25000;
		this.tution_fees = 25000;
		this.fee1 = 10000;
		tfees = ad_fee + tution_fees + fee1;
		if (branch.equalsIgnoreCase("MCA")) {
			tfees += 30000;
		}else {
			tfees += 25000;
		}
		return tfees;
	}

	public void display() {
		System.out.println("Name: "+name+" \n Address: "+address+" \n phone no: "+phoneno+" \n emailid: "+stud_emailid+" \n branch:"+branch);
	}

	public void display(String branch) {
		double feecal = this.fee(branch);
		System.out.println("Total fees for the branch : "+branch+" total fees:"+feecal);
	}

	public void display(int no_of_fields) {
		if(no_of_fields==3) {
			System.out.println("Name: "+name+" \n Address: "+address+" \n phone no: "+phoneno);
		}else {
			System.out.println("Name: "+name+" \n Address: "+address+" \n phone no: "+phoneno+" emailid: "+stud_emailid+" branch:"+branch);
		}
	}

	public static void main(String args[]) {
		program1b s;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the student details");
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the address");
			String add = sc.next();
			System.out.println("Enter the branch");
			String branch = sc.next();
			System.out.println("To enter email-id and phoneno, Enter 1");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter the phoneno");
				String phoneno = sc.next();
				System.out.println("Enter the emailid");
				String emailid = sc.next();
				s = new program1b(name, add, phoneno, emailid, branch);
			} else {
				s = new program1b(name, add, branch);
			}
			
			System.out.println("1. Display all details of student");
			System.out.println("2. Display total branch fees");
			System.out.println("3. Display selected fields");
			choice = sc.nextInt();
			if (choice == 1) {
				s.display();
			} else if (choice == 2) {
				System.out.println("Enter the branch");
				branch = sc.next();
				s.display(branch);
			} else if (choice == 3) {
				System.out.println("Enter the no of fields(3 or 5) to display");
				int nooffields = sc.nextInt();
				s.display(nooffields);
			} else {
				System.out.println("Wrong choice");
			}
			System.out.println("Enter choice 1. continue 2. exit");
			choice = sc.nextInt();
			if (choice == 2) {
				break;
			}
		}
	}
}
