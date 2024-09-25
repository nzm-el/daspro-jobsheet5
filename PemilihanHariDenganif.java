import java.util.Scanner;
public class PemilihanHariDenganif {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int angka;
    System.out.println("Input number day (1-7): ");
    angka = sc.nextInt();

    if (angka >= 1 && angka <= 5) {
        System.out.println("Weekday");
    }
    else if(angka == 6 || angka == 7) {
        System.out.println("Weekend");
    }
    else {
        System.out.println("Invalid number");
    }
    }
}