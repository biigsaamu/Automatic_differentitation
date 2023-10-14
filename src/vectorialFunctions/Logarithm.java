package vectorialFunctions;

public class Logarithm implements Function{
  private Function expression;

  public Logarithm( Function expression) {
    this.expression = expression;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber value = expression.calculate(dn);
    //f(x)
    double log = Math.log(value.u);
    System.out.println("log(" + value + ") is " + log);
    //f'(x)
    double derivativeLog = value.uprime / value.u;
    return new DualNumber(log, derivativeLog);
  }

  @Override
  public String getOperation() {
    return "log(" + expression.getOperation() + ")";
  }

  @Override
  public void print() {
    System.out.print(getOperation());
  }
  /*public String toString() {
    return "log(" + expression + ")";
  }*/
}
