public class Multadd {
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double sonuc = x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
        return sonuc;
    }

    public static void main(String[] args) {
        double sonuc1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println("\nsin(pi/4) + cos(pi/4)/2 = " + sonuc1);

        double sonuc2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log(10) + log(20) = " + sonuc2);

        double sonuc3 = expSum(1);
        System.out.println("expSum(1) = " + sonuc3);
        System.out.println();
    }
}
