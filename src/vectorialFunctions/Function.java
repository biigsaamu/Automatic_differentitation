package vectorialFunctions;

public interface Function {
  public abstract DualNumber calculate(DualNumber dn);
  public abstract String getOperation();
  public void print();
}

