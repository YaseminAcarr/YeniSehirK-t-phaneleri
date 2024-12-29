//ÖğrenciNumarası: 230706055
//AdSoyad: Yasemin ACAR
public class Kitap {

	private String kitapAdi;
	private boolean oduncAlindi;
	
	// Yeni bir kitap yaratır.
	public Kitap(String kitapAdi) {
		this.kitapAdi=kitapAdi;
		this.oduncAlindi=false;	
	}
		
	// Kitabı ödünç alındı olarak işaretler.
	public void oduncAl() {
		this.oduncAlindi=true;
	} 
		 
	// Kitabı ödünç alınmadı olarak işaretler.
	public void iadeEt() {
		this.oduncAlindi=false;
	 }
		 
	// Kitap ödünç alındıysa “true”, ödünç alınmadıysa “false” değerini döndürür.
	public boolean oduncAlindiMi() {
		 return this.oduncAlindi;	 
	}
	
	// Kitap adını geri döndürür.
	public String getKitapAdi() {
		return this.kitapAdi;	 
	}

public static void main(String[] args) {
	// Kitap sınıfı testi
	 Kitap ornek = new Kitap("Olasılıksız");
	 System.out.println("Kitap adı: " + ornek.getKitapAdi());
	 System.out.println("Ödünç alındı mı? : " + ornek.oduncAlindiMi());
	 ornek.oduncAl();
	 System.out.println("Ödünç alındı mı? : " + ornek.oduncAlindiMi ());
	 ornek.iadeEt();
	 System.out.println("Ödünç alındı mı? : " + ornek.oduncAlindiMi ());
	 }
}


