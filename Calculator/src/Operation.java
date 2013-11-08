import java.util.HashMap;

public abstract class Operation {

	public Operation() {
		super();
	}
	
	public static Operation selectOperator(String operator) {
		HashMap<String, Operation> operations = new HashMap<String, Operation>();
		operations.put("+", new Addition());
		operations.put("-", new Soustraction());
		operations.put("*", new Multiplication());
		operations.put("/", new Division());
		return operations.get(operator);
	}
	
	public abstract double calcule(double resultat, double oP);

}