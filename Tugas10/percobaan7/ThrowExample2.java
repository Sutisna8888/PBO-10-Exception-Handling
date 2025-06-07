package percobaan7;

public class ThrowExample2 {
    public static void main(String[] args) {
        try {
            throw new Exception("Here's my Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}

/* Analis:
 * kode di atas membuat sebuah Exception dengan pesan "Here's my Exception" dan 
 * melemparkannya menggunakan `throw, kemudian ditangkap dalam blok `catch`.
 * pada blok `catch`, informasi tentang Exception ditampilkan.
 * Tujuan utamanya adalah mendemonstrasikan berbagai metode 
 * yang bisa digunakan untuk menampilkan informasi dari sebuah exception.
 */
