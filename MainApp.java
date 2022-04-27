package vd1;
import vd.*;
public class MainApp {
	
	public class MainApplication {

		public static void main(String[] args) {
		     Employee emp= new Employee(1207,"geetha","borigi",20000);
		     System.out.println(emp.getId());
		     System.out.println(emp.getFirstName());
		     emp.setSalary(30000);
		     System.out.println(emp.getSalary());
		     System.out.println( emp.getAnnualSalary(20000));
		     System.out.println(emp.raiseSalary(10));
		     System.out.println(emp.toString());
		     Author a=new Author("james","james@gmail.com",'M');
		     Book b=new Book("java",a,100,1);
		     System.out.println(b.toString());
		     
		     
	         
		}

	}
}
