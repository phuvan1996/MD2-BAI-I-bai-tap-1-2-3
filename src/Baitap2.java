import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ti gia USD");
        int usd = scanner.nextInt();
        int vnd = 23000;
        System.out.println("ti gia VND la: "+ usd*vnd);
    }
}
