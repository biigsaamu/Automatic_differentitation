package vectorialFunctions;

public class DualNumber {

  protected double u;
  protected double uprime;

  public DualNumber(double u, double uprime) {
    this.u = u;
    this.uprime = uprime;
  }

  @Override
  public String toString(){
    return "u: " + this.u + " uprime: " + this.uprime;
  }
}
