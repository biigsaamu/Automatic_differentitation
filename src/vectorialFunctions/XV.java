package vectorialFunctions;

public class XV implements Function{
  private Function expression;
  public XV() { // i think this should be empty - slide 17
    //this.expression = expression;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    //System.out.println(expression + " " + result);
    return new DualNumber(dn.u, 1.0);
  }

  public String getOperation() {
    return "x";
  }

  @Override
  public void print() {
    System.out.print(getOperation());
  }
  /*public String toString() {
    return "X(" + expression
        + ")";
  }*/
}
