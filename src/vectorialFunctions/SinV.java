package vectorialFunctions;


public class SinV implements Function{
  private Function expression;

  public SinV( Function expression) {
    this.expression = expression;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber value = expression.calculate(dn);
    //f(x)
    double sin = Math.sin(value.u);
    //System.out.println("sin(" + value + ") is " + sin);
    //f'(x)
    double derivativeSin = Math.cos(value.u) * value.uprime;
    return new DualNumber(sin, derivativeSin);
  }

  @Override
  public String getOperation() {
    return "sin(" + expression.getOperation() + ")";
  }

  @Override
  public void print() {
    System.out.print(getOperation());
  }
  /*public String toString() {
    return "sin(" + expression + ")";
  }*/
}
