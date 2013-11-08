public class Calculette {

	private double resultat;
	private double OP;
	private Operation operation = new Addition();
	
	
	public double getResultat() {
		this.pushResult();
		return this.resultat;
	}

	public Calculette click(int i) {
		this.OP = this.OP * 10 + i;
		return this;
	}

	public Calculette click(String operator) {
		this.pushResult();
		this.operation = Operation.selectOperator(operator);
		return this;
	}
	
	public Calculette pushResult(){	
		this.resultat = this.operation.calcule(this.resultat,this.OP);
		this.OP = 0;
		return this;
	}

}
