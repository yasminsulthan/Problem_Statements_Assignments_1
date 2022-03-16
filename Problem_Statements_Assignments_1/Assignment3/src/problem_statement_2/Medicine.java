package problem_statement_2;

public class Medicine {
public void displayLabel(){
	System.out.println("Company : Globex Pharma");
	System.out.println("Address : Bangalore");
	}
}
class Tablet extends Medicine{
}
class Syrup extends Medicine{public void displayLabel(){
	System.out.println("Consumption as directed by thephysician");
	}
}
class Ointment extends Medicine{public void displayLabel(){
	System.out.println("for external use only");
	}
}


