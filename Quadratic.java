// good
public class Quadratic {
  public static void main(String[] args) {
    // FIXME: use "double", not "Double" for variable types
    Double a = Double.parseDouble(args[0]);
    Double b = Double.parseDouble(args[1]);
    Double c = Double.parseDouble(args[2]);

    Double negb = (b * -1);
    Double bsq = (b * b);
    Double fourac = (4 * a * c);
    Double twoa = (2 * a);
    Double sqrt = Math.sqrt(bsq - fourac);

    Double solution1 = ((negb + sqrt) / twoa);
    Double solution2 = ((negb - sqrt) / twoa);

    System.out.println("x = " + solution1);
    System.out.println("OR");
    System.out.println("x = " + solution2);
  }
}
