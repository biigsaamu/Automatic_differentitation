package vectorialFunctions;

public class XV implements Function{
  private Function expression;
  public XV(Function expression) { // i think this should be empty - slide 17
    this.expression = expression;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    //System.out.println(expression + " " + result);
    return new DualNumber(dn.u, 1.0);
  }

  public String toString() {
    return "X(" + expression
        + ")";
  }
}
