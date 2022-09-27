package methods;
	
public class main {
	public static void main(String[]args) {
		sayiBulmaca();
    }
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,5,7,9,10};
		int aranacak = 9;
		boolean varMi = false;
		
		for (int sayi : sayilar){
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj = " ";
		if(varMi) {
			mesaj = aranacak + " mevcuttur";
			mesajVer(mesaj);
			
		}else {
			System.out.println(aranacak + " mevcut değildir");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
