Abstraction:
------------
Hiding all the details and displaing only functionality.

concrete method:
---------------
//Method Dec
public returntype methodname()
{
//Method Body
}

Concrete Class:
---------------

If a class contains only concrete methods we call that class as 
concrete Class.

abstract method:
----------------

//Method Dec
public returntype methodname();

abstract class:
--------------

If a class contain atleast one abstract method we call that Class
as abtract class.


public double getSalary(int empId);

public List<Employee> getEmployeeDetails();

public String getName(int id);


abstract 


package com.demo.abtraction;

public abstract class Bill {

	public abstract double getBillAmount(int noOfUnits);

	public abstract void printBillAmount(double billAmount);

}


package com.demo.abtraction;

public class EBill extends Bill {


	@Override
	public double getBillAmount(int noOfUnits) {
		return noOfUnits * 1.5;
	}

	@Override
	public void printBillAmount(double billAmount) {
		System.out.println("Electricity Bill is:" + billAmount);
	}

}

package com.demo.abtraction;

public class App {
	
	public static void main(String[] args) {
		
		
		Bill bill = new EBill();
		double billAmount = bill.getBillAmount(150);
		bill.printBillAmount(billAmount);
		
	}

}

package com.demo.abtraction;

public abstract class Bill {

	public abstract double getBillAmount(int noOfUnits);

	public abstract void printBillAmount(double billAmount);

}


package com.demo.abtraction;

public abstract class EBill extends Bill {

	@Override
	public double getBillAmount(int noOfUnits) {
		return noOfUnits * 1.5;
	}

}


package com.demo.abtraction;

public class PrintBill extends EBill {

	@Override
	public void printBillAmount(double billAmount) {
		System.out.println("test");
	}

}


package com.demo.abtraction;

public class App {
	
	public static void main(String[] args) {
		
		
		Bill bill = new PrintBill();
		double billAmount = bill.getBillAmount(150);

		System.out.println(billAmount);
		
	}

}


package com.demo.abtraction;

public abstract class Bill {

	public abstract double getBillAmount(int noOfUnits);

	public abstract void printBillAmount(double billAmount);

	public void billingCompany() {
		System.out.println("----NPDCL----");
	}
}



package com.demo.abtraction;

public abstract class EBill extends Bill {

	@Override
	public double getBillAmount(int noOfUnits) {
		return noOfUnits * 1.5;
	}
}

package com.demo.abtraction;

public class PrintBill extends EBill {

	@Override
	public void printBillAmount(double billAmount) {
		System.out.println("test");
	}

}


package com.demo.abtraction;

public class App {
	
	public static void main(String[] args) {
		
		
		Bill bill = new PrintBill();
		bill.billingCompany();
		double billAmount = bill.getBillAmount(150);
		System.out.println(billAmount);
		
	}

}

package com.demo.abtraction;

public abstract class Bill {

	public static final String pincode = "500090";

	public abstract double getBillAmount(int noOfUnits);

	public abstract void printBillAmount(double billAmount);

	public void billingCompany() {
		System.out.println("----NPDCL----");
	}
}

package com.demo.abtraction;

public class App {
	
	public static void main(String[] args) {
		
		
		Bill bill = new PrintBill();
		System.out.println(bill.pincode);
		bill.billingCompany();
		double billAmount = bill.getBillAmount(150);
		System.out.println(billAmount);
		
	}

}


package com.demo.abtraction;

public abstract class Bill {

	 String pincode = "500090";

	public abstract double getBillAmount(int noOfUnits);

	public abstract void printBillAmount(double billAmount);

	public void billingCompany() {
		System.out.println("----NPDCL----");
	}
}

package com.demo.abtraction;

public class App {
	
	public static void main(String[] args) {
		
		
		Bill bill = new PrintBill();
		bill.pincode="5100090";
		System.out.println(bill.pincode);
		bill.billingCompany();
		double billAmount = bill.getBillAmount(150);
		System.out.println(billAmount);
		
	}

}







