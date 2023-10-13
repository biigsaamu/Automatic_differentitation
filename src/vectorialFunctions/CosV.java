package vectorialFunctions;


public class CosV implements Function{
  private Function expression;

  public CosV(Function expression) {
    this.expression = expression;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber value = expression.calculate(dn);
    //f(x)
    double cos = Math.cos(value.u);
    System.out.println("cos(" + value + ") is " + cos);
    //f'(x)
    double derivativeCos = Math.sin(value.u) * (value.uprime * -1);
    return new DualNumber(cos, derivativeCos);
  }

  public String toString() {
    return "cos(" + expression + ")";
  }
}
