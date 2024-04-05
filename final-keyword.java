
final:
------

It is used for creating constants(It cannot be modified).

 variable  : Assigment is not possible

 method    : Overiding is mot possible

 class     : Inheritance is not possible



 final variables:
 ---------------

 package com.demo.finalkeyword;

public class Employee {

	int id = 20;

	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println("Befroe :" + emp.id);

		emp.id = 21;
		System.out.println("After :" + emp.id);

	}

}


package com.demo.finalkeyword;

public class Employee {

	final int id = 20;

	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println("Befroe :" + emp.id);

		emp.id = 21;
		System.out.println("After :" + emp.id);

	}

}


CE:
The final field Employee.id cannot be assigned


package com.demo.finalkeyword;

public class Employee {

	int id;
	String name;
	public final static String CNAME = "AshokIT";

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {

		System.out.println(id);
		System.out.println(name);
		System.out.println(CNAME);
	}

}


package com.demo.finalkeyword;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Raj");
		emp1.display();
		Employee emp2 = new Employee(2, "Kumar");
		emp2.display();
		Employee emp3 = new Employee(3, "Ravi");
		emp3.display();
		
	}
}


package com.demo.finalkeyword;

public class Employee {

	final String cname;

	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println(employee.cname);
		;

	}

}


CE:
The blank final field cname may not have been initialized

package com.demo.finalkeyword;

public class Employee {

//During  Dec time
	final String cname ="AshokIT";

	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println(employee.cname);
		;

	}

}


package com.demo.finalkeyword;

public class Employee {

	final String cname ;
	
	//Using  Cons we can intialize a final variable
	public Employee() {
		cname="AshokIT";
	}

	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println(employee.cname);
		;

	}

}


package com.demo.finalkeyword;

public class Employee {

	final String cname ;
	
	//Instance Block
	{
		cname="AshokIT";
	}
	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println(employee.cname);
		;

	}

}



package com.demo.finalkeyword;

public final class A {

	public void m1() {
		System.out.println("we are in m1");
	}

	public void m2() {
		System.out.println("we are in m2");
	}
}


package com.demo.finalkeyword;

public class App {

	public static void main(String[] args) {
		

		A a = new A();
		a.m1();
		a.m2();
		
	}
}
