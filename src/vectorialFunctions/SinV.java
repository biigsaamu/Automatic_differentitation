package vectorialFunctions;


public class SinV implements Function{
  private Function expression;

  public SinV( Function expression) {
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
