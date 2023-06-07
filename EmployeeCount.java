//WAP create 5 employee object for an employee class and show the count of no of employees

package P1;

public class EmployeeCount {
	  private static int count = 0; 
	    private String name;

	    public EmployeeCount(String name) {
	        this.name = name;
	        count++;
	    }

	    public static int getCount() {
	        return count; 
	    }

	   
	    public static void main(String[] args) {
	       
	        EmployeeCount employee1 = new EmployeeCount("Aakash");
	        EmployeeCount employee2 = new EmployeeCount("Dhruvi");
	        EmployeeCount employee3 = new EmployeeCount("Vijay");
	        EmployeeCount employee4 = new EmployeeCount("Rahul");
	        EmployeeCount employee5 = new EmployeeCount("Kavya");

	        // Display the count of employees
	        System.out.println("Number of employees: " + EmployeeCount.getCount());
	    	}
}
