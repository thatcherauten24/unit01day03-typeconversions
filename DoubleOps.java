class DoubleOps {
    public static void main(String[] args) {
        
        System.out.println("The first argument provided was " + args [0]); 
        System.out.println("The second argument provided was " + args [1]); 
        
        System.out.println("This function will take the absolute value of the first argument" + Math.abs(Integer.parseInt(args[0])));

        System.out.println("This function will take the absolute value of the second argument, which can be a double " + Math.abs(Double.parseDouble(args[1])));

        System.out.println("This function will raise the first argument to the power of the second argument " + Math.pow(Double.parseDouble(args[0]), Double.parseDouble(args[1])));

        System.out.println("This function will return the positive square root of a double value " + Math.sqrt(Double.parseDouble(args[0])));

        System.out.println("This function will return a double value greater than or equal to 0.0 and less than 1.0 " + Math.random());
    }
}