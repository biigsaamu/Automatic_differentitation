package scalarFunctions;

public class Pow implements ArithmeticExpression{

  private ArithmeticExpression base;
  private ArithmeticExpression exponent;

  public Pow(ArithmeticExpression base, ArithmeticExpression exponent) {
    this.base = base;
    this.exponent = exponent;
  }

  public double calculate(){
    double result = 0;
    result = Math.pow(base.calculate(), exponent.calculate());
    System.out.println("Pow " + base + "^" + exponent + " = " + result);
    return result;
  }

  @Override
  public String toString() {
    return "Pow " + base + "^" + exponent;
  }
}
