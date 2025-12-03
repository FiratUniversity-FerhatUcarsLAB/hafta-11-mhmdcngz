import java.util.Scanner;

public class Exercise4_1 {
    static Scanner input = new Scanner(System.in);

    public static void printAmerican(String hgun, int gun, String ay, int yil) {
        System.out.printf("%s, %s %d, %d\n", hgun, ay, gun, yil);
    }

    public static void printEuropan(String hgun, int gun, String ay, int yil) {
        System.out.printf("%d %s %d, %s\n", gun, ay, yil, hgun);
    }

    public static boolean hgunKontrol(String hgun) {
        if (hgun.equals("Pazartesi") || hgun.equals("Sali") || hgun.equals("Carsamba")
                || hgun.equals("Persembe") || hgun.equals("Cuma")
                || hgun.equals("Cumartesi") || hgun.equals("Pazar")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ayKontrol(String ay) {
        if (ay.equals("Ocak") || ay.equals("Subat") || ay.equals("Mart") || ay.equals("Nisan")
                || ay.equals("Mayis") || ay.equals("Haziran") || ay.equals("Temmuz")
                || ay.equals("Agustos") || ay.equals("Eylül") || ay.equals("Ekim")
                || ay.equals("Kasim") || ay.equals("Aralik")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Gün Giriniz(Sali,Carsamba vb.): ");
        String hgun = input.next();
        System.out.print("Ayın Kaçı: ");
        int gun = input.nextInt();
        System.out.print("Ay giriniz(Ocak,Subat vb.): ");
        String ay = input.next();
        System.out.print("Yıl giriniz: ");
        int yil = input.nextInt();

        if ((gun > 0) && (32 > gun) && (yil > 0) && (2026 > yil)) {
            if ((ayKontrol(ay) == true) && (hgunKontrol(hgun) == true)) {
                printAmerican(hgun, gun, ay, yil);
                printEuropan(hgun, gun, ay, yil);
            } else {
                System.out.println("Hatalı Giriş");
            }
        } else {
            System.out.println("Hatalı Giriş");
        }
    }
}