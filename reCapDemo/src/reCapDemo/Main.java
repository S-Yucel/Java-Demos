package reCapDemo;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		System.out.println(sonuc);
		int sonuc2 = dortIslem.Carp(3, 4);
		System.out.println(sonuc2);
		int sonuc3 = dortIslem.Cikar(3, 4);
		System.out.println(sonuc3);
		int sonuc4 = dortIslem.Bol(3, 4);
		System.out.println(sonuc4);
		

	}

}
