package scalarFunctions;

import java.lang.Math;

public class Cos implements ArithmeticExpression{

  private ArithmeticExpression expression;

  public Cos(ArithmeticExpression expression){
    this.expression = expression;
  }
  public double calculate() {
    System.out.println("Converting " + expression + " to radians");
    double value = expression.calculate();
    System.out.println("Cos = "+ Math.cos(value));
    return Math.cos(value);
  }
  public String toString() {
    return "cos(" + expression + ")";
  }
}

