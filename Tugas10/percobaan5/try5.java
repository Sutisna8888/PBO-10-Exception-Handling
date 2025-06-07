package percobaan5;

public class try5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0); // Ini akan menyebabkan ArithmeticException karena pembagian dengan nol
        } 
        catch (ArithmeticException e) { // catch kemudian menangkap error tersebut
            System.out.println("Pesan error: "); 
            System.out.println(e.getMessage()); // menampilkan pesan error yang terjadi
            System.out.println("Info stack trace");
            e.printStackTrace(); // menampilkan jejak error di konsol (sumber & lokasi kesalahan).
            e.printStackTrace(System.out); 
        } 
        catch (Exception e) { // block kode ini tidak akan dieksekusi karena sudah ada catch untuk ArithmeticException
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}

// analisis try dan catch:
// program ini mencoba untuk membagi bilangan 10 dengan 0, yang akan menyebabkan ArithmeticException.
// kemudian catch menangkap eror tersebut dan menampilkan informasi pesan error