import java.util.Scanner;
public class Latihan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;

        System.out.println("Masukkan usia anda: ");
        usia = sc.nextInt();

        if (usia < 0) {
            System.out.println("Usia tidak boleh negatif");
        }

            if (usia <= 12) {
            System.out.println("Anda termasuk kategori Anak ");
            }
            else if (usia > 12 && usia <= 19) {
            System.out.println("Anda termasuk kategori Remaja ");
            }
            else if (usia > 19 && usia <= 64) {
            System.out.println("Anda termasuk kategori Dewasa ");
            }
            else {
            System.out.println("Anda termasuk kategori Lansia ");
        }
    }
}
