package vectorialFunctions;


import scalarFunctions.ArithmeticExpression;

public class XV implements Function{
  private Function expression;
  public XV(Function expression) {
    this.expression = expression;
  }

  @Override
  public double calculate() {
    double result = expression.calculate();
    System.out.println(expression + " " + result);
    return result;
  }

  public String toString() {
    return "X(" + expression
        + ")";
  }
}
