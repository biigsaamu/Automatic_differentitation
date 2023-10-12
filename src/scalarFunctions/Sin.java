package scalarFunctions;

public class Sin implements ArithmeticExpression{

  private ArithmeticExpression expression;

  public Sin( ArithmeticExpression expression) {
    this.expression = expression;
  }

  @Override
  public double calculate() {
    double value = expression.calculate();
    double sin = Math.sin(value);
    System.out.println("sin(" + value + ") is " + sin);
    return sin;
  }

  public String toString() {
    return "sin(" + expression + ")";
  }
}
