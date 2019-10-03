package calculatorProj;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(4).setOperandTwo(5).setOperation("+").performOperation();
		System.out.println(calc.getResults());
		System.out.println(calc.setOperation("-").setOperandOne(7).performOperation().getResults());
		calc.setOperandOne(calc.res).setOperation("+").performOperation();
		System.out.println(calc.getResults());
		System.out.println(calc.setOperation("+").setOperandOne(10.5).setOperandTwo(5.2).performOperation().getResults());
	}

}
