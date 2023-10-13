package vectorialFunctions;

import scalarFunctions.ArithmeticExpression;

public class RestaV extends BinaryOperatorV{
  public RestaV(Function op1, Function op2) {
    super(op1,op2);
  }

  @Override
  public double calculate() {
    double result;
    result = op1.calculate() - op2.calculate();
    System.out.println("Resta: " + op1 + " - " + op2 + " = " + result);
    return result;
  }

  public String toString() {
    return "(" + op1 + " - " + op2 + ")";
  }
}
