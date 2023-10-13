package vectorialFunctions;

public class Exponential implements Function{
  private Function expression;

  public Exponential( Function expression) {
    this.expression = expression;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber value = expression.calculate(dn);
    //f(x)
    double exp = Math.exp(value.u);
    System.out.println("exp(" + value + ") is " + exp);
    //f'(x)
    double derivativeExp = exp * value.uprime;
    return new DualNumber(exp, derivativeExp);
  }

  public String toString() {
    return "exp(" + expression + ")";
  }
}