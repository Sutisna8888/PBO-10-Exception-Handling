package percobaan8;

import java.io.*;

public class test3 {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        System.out.println(20 / 0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) throws IOException {
        test3 c = new test3();
        c.methodA();
        c.methodB();
    }
}

/*Method methodB() dapat melempar exception ArithmeticException, yang dibungkus oleh throws IOException.
 * pada method main(), throws IOException digunakan untuk menyampaikan bahwa method tersebut melempar exception, 
 * meskipun exception yang terjadi sebenarnya bukan IO, melainkan ArithmeticException. 
 */



class utama {
    public static void main(String[] args) {
        test3 o = new test3();
        o.methodA();
        try {
            o.methodB();
        } catch (Exception e) {
            System.out.println("Error di Method B");
        } finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}

/*  penggunaan try pada clasa utama memungkinkan penanganan exception yang lebih baik.
 * Jika terjadi exception pada methodB(), program tidak akan berhenti, 
 * dan akan mencetak "Error di Method B" serta "Ini selalu dicetak" yang menunjukkan bahwa 
 * blok finally selalu dieksekusi.
*/