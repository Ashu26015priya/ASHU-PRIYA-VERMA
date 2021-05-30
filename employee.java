import java.util.Scanner;
public class Employees {

	public Employees() {}

	public void getInput () {
		 int yearofjoining;
		 String name;
		 String address;
		  Scanner in = new Scanner(System.in);

		  System.out.print("Enter the name :: ");
		  name = in.next();
		  System.out.print("Enter the Year Of Joining :: ");
		  yearofjoining = in.nextInt();
		  System.out.print("Enter the Address :: ");
		  address = in.next();

		  System.out.println("Employee name = " + name);
		  System.out.println("Employee Year Of Joining = " + yearofjoining);

		  System.out.println("Employee Address = " + address);
	   }

		  public static void main(String[] args) {
			  Employees e[] = new Employees[3];

			  for(int i=0; i<5; i++) {

			   e[i] = new Employees();
			   e[i].getInput();
			  }

			  System.out.println("**** Data Entered as below ****");

			  for(int i=0; i<5; i++) {

			   e[i].display();
			  }
			 }

		private void display() {
			// TODO Auto-generated method stub

		}
			}

 
 
