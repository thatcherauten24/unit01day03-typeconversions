public class Quadratic {
    public static void main(String[] args) {
        
        // System.out.println("Enter three arguments, a, b, and c, to be solved with quadratic formula where ax^2+bx+c = 0");

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("x = " + ((b*-1) + (Math.sqrt(Math.pow(b, 2) + (-4*a*c)))/2*a));
        System.out.println("OR");
        System.out.println("x = " + ((b*-1) - (Math.sqrt(Math.pow(b, 2) + (-4*a*c)))/2*a));








    }
}
