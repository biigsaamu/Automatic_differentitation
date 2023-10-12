package scalarFunctions;

import java.util.ArrayList;

public class Expression implements ArithmeticExpression {
  private ArithmeticExpression expression;

  public Expression(ArithmeticExpression expression) {
    this.expression = expression;
  }

  @Override
  public double calculate() {
    double result = expression.calculate();
    System.out.println("Expression result = " + result);
    return result;
  }

}

