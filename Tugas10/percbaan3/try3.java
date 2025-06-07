package percbaan3;

public class try3 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        } 
        catch (ArithmeticException e) {
            System.out.println("Terjdi error Arithmetic");
        }
        catch (Exception e) 
        {
            System.out.println("ini menghandle error yang terjadi");
        }
    }
}
