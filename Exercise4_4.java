public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.

        // Cevap1) ifadeyi arka planda döndürür ama ekrana yazdırmaz, hata vermez.
        // Cevap2) void metodu bir ifadenin içinde kullanılırsa kod çalışmaz, hata
        // verir.
        // Hata Mesajı: “+ operatörünü şu tipler arasında kullanamazsın: void ve int.”

    }
}
