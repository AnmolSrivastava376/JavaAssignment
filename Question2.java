public class Question2 {
    public static void main(String[] args) {
        try {
            Divide(10,0);
            // DivideUsingThrows(20, 0);
        } catch (ArithmeticException arthErr) {
            System.out.println("Caught an exception while division : " + arthErr.getMessage());
        }
    }
    public static void DivideUsingThrows(int x,int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("You cannot divide by zero T_T");
        }
        int res = x / y;
        System.out.println(x+"/"+y+" = " + res);
    }
    public static void Divide(int x,int y) {
        if (y == 0) {
            throw new ArithmeticException("Error : Division by zero :)");
        }
        int res = x / y;
        System.out.println(x+"/"+y+" = " + res);
    }
    
}