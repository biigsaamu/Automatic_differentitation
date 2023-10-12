package scalarFunctions;

public class Div extends BinaryOperator{

  public Div(ArithmeticExpression op1, ArithmeticExpression op2) {
    super(op1,op2);
  }

  @Override
  public double calculate() {
    double result;
    result = op1.calculate() / op2.calculate();
    System.out.println("Div: " + op1 + " / " + op2 + " = " + result);
    return result;
  }

  public String toString() {
    return "(" + op1 + " / " + op2 + ")";
  }
}
