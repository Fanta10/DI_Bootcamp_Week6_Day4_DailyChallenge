package dailycallenge;

public class Calculator {
	//attributs
	private double num1;
	private double num2;
	
	//construcuteur sans parametres
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	//construcuteur avec parametres
	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//getters et setters
	public double getNum1() {
		return num1;
	}



	public void setNum1(double num1) {
		this.num1 = num1;
	}



	public double getNum2() {
		return num2;
	}



	public void setNum2(double num2) {
		this.num2 = num2;
	}
	//methodes
	private double add() {
		return this.num1 + this.num2;
		
	}
	private double subtract() {
		return this.num2 - this.num1;
		
	}
	private double multiply() {
		return this.num1 * this.num2;
		
	}
	private double divide() {
		return this.num2 / this.num1;
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator(10, 94);
		System.out.println("Addition : " + obj.add());
		System.out.println("Soustraction : " + obj.subtract());
		System.out.println("Multiplication : " + obj.multiply());
		System.out.println("Division : " + obj.divide());
		
		

	}

}
