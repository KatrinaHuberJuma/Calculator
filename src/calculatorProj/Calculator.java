package calculatorProj;

public class Calculator {
	double num1;
	double num2;
	String op;
	double res;

	public Calculator() {
		num1 = 0;
		num2 = 0;
		res = 0;
		op = "Please set an operand";
	}
	public Calculator setOperandOne(double num) {
		num1 = num;
		System.out.println(this.num1);
		return this;
	}
	public Calculator setOperandTwo(double num) {
		num2 = num;
		System.out.println(num2);
		return this;
	}
	public Calculator setOperation(String op) {
		this.op = op;
		System.out.println(this.op);
		return this;
	}
	public Calculator performOperation() {
		System.out.println(num1 + op + num2 + " = ");
		if (op == "+") {
			res = num1 + num2;
		} else if (op == "-") {
			res = num1 - num2;
		}
		System.out.println(res);
		return this;
	}
	public double getResults() {
		return res;
	}
}
