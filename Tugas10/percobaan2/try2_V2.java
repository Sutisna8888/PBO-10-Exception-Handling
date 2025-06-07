package percobaan2;
public class try2_V2 {
    public static void main(String[] args){
        int i = 0;
        String greeting[] = {"Hello World", "No I mean it!", "Hello World"};
        int resetCount = 0;  // Untuk melacak berapa kali terjadi error dan di-reset

        while (i < 4 && resetCount < 1) {
            try {
                System.out.println(greeting[i]);
                i++;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i = 0;
                resetCount++;  // Tambah 1 kali reset
            }
        }

        System.out.println("Program selesai.");
    }
}
