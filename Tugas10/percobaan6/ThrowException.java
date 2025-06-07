package percobaan6;

public class ThrowException {
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;

        // Baris ini tidak akan dieksekusi
        //System.out.println("Ini tidak lagi dicetak");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}

// analisis:
/*Program ini mendemonstrasikan penggunaan throw untuk melemparkan sebuah exception secara manual.
Program menunjukkan bahwa exception bisa dibuat secara manual menggunakan throw, 
dan hanya akan ditangani jika diletakkan dalam blok try-catch */  