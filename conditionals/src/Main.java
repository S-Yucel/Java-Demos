public class Main {
    public static void main(String[] args) {
        int sayi = 54;
        if (sayi <  54) {
            System.out.println("Sayı 15 den küçüktür");
        }
        // çift eşittir matematiksel eşittiri ifade eder, tek = ise atama yapar
        else if (sayi == 54){
            System.out.println("Sayı 54 e eşittir");
        } else {
            System.out.println("Sayı 54 ten büyüktür");
        }
       // veri kaçaklarını önlemek için olabilecek bütün açıkları gözönünde bulundurularak yazılan
        // programlamaya defensie programming denir.
    }
}