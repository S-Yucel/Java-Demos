public class Main {
    public static void main(String[] args)
    {
        String ogrenci1 = "Sariye";
        String ogrenci2 = "Elif";
        String ogrenci3 = "Veli";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Sariye";
        ogrenciler[1] = "Elif";
        ogrenciler[2] = "Veli";
        ogrenciler[3] = "Deniz";

        for (int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }

        // veya

        for ( String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}