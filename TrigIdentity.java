// good
public class TrigIdentity {
    public static void main(String[] args) {
        Double theta = Double.parseDouble(args[0]);
        // Math.sin is sufficient; don'e need "java.lang.Math.sin"
        System.out.println(Math.pow(java.lang.Math.sin(theta), 2) + Math.pow(java.lang.Math.cos(theta), 2));
    }
}
