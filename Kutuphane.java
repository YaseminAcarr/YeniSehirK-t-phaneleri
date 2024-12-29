//ÖğrenciNumarası: 230706055
//AdSoyad: Yasemin ACAR
public class Kutuphane {
		private String adres;
		private Kitap[] kitaplar;
		private int kitapSayisi;
		

		//Kütüphane oluştur.
		public Kutuphane(String adres) {
			this.adres=adres;
			this.kitaplar =new Kitap[500];
			this.kitapSayisi=0;
		}
		
		// Kütüphane adresini yazdırır.
	    public void adresYazdir() {
	        System.out.println(this.adres);
	    }
	    // Kütüphane açık saatlerini yazdırın.
	 	public static void acikSaatleriYazdir() { 
	 		System.out.println("Kütüphaneler her gün 09:00-17:00 saatleri arasında açıktır.");
	 	}
	 		
		//Kütüphaneye kitap ekle.
		public void kitapEkle(Kitap kitap) {
			if (kitapSayisi <500) {
				this.kitaplar[kitapSayisi]=kitap;
				kitapSayisi++;
			}else {
				System.out.println("Kütüphane kapasitesi doldu");
			}
		}
		//Kitap ödünç alma.
		public void kitapOduncAl(String kitapAdi) {
			for(int i=0; i<kitapSayisi ; i++) {
				if(kitaplar[i].getKitapAdi().equals(kitapAdi)) {
					if (!kitaplar[i].oduncAlindiMi()) {
						kitaplar[i].oduncAl();
						System.out.println(kitapAdi + " kitabını başarılı şekide ödünç aldınız.");
						return;
					}else {
						System.out.println( "Üzgünüm, bu kitap zaten ödünç verilmiştir.");
						return;
					}
				}
			}
			System.out.println("Üzgünüm, bu kitap kataloğumuzda bulunmamaktadır.");
		}
		//Kitap iade etme.
		public void kitapIadeEt(String kitapAdi) {
			for(int i=0 ;i<kitapSayisi ; i++) {
				if (kitaplar [i].getKitapAdi().equals(kitapAdi)) {
					if(kitaplar[i].oduncAlindiMi()) {
						kitaplar[i].iadeEt();
						System.out.println(kitapAdi+ " kitabını başarılı şekilde iade ettiniz.");
						return;
					}else {
						System.out.println(kitapAdi +"ödünç alınmamış.");
						return;
					}
				}
			}
			System.out.println(kitapAdi + " kütüphanede bulunmayan bir kitaptır.");	
		}
			 
		public void mevcutKitaplariYazdir() {
			 if (kitapSayisi ==0) {
				System.out.println("Katalogda kitap bulunmamaktadır.");
			}else {	 
			   for (int i = 0; i < kitapSayisi; i++) {
					if (!kitaplar[i].oduncAlindiMi()) {
							 System.out.println(kitaplar[i].getKitapAdi());
				    }
				}
			 }
		 }
		
				 


	public static void main(String[] args) {
		// İki kütüphane yaratın.
		 Kutuphane birinciKutuphane = new Kutuphane("Atatürk Bulvarı");
		 Kutuphane ikinciKutuphane = new Kutuphane("Kurtuluş Bulvarı");
		 // Birinci kütüphaneye dört kitap ekleyin.
		 birinciKutuphane.kitapEkle(new Kitap("Olasılıksız"));
		 birinciKutuphane.kitapEkle(new Kitap("Empati"));
		 birinciKutuphane.kitapEkle(new Kitap("Kaiken"));
		 birinciKutuphane.kitapEkle(new Kitap("Mesaj"));
		 // Kütüphane açık saatlerini yazdırın.
		 System.out.println("Kütüphane saatleri:");
		 acikSaatleriYazdir();
		 System.out.println();
		 // Kütüphanelerin adreslerini yazdırın.
		 System.out.println("Kütüphane adresleri:");
		 birinciKutuphane.adresYazdir();
		 ikinciKutuphane.adresYazdir();
		 System.out.println();
		 // Her iki kütüphaneden "Olasılıksız" kitabını ödünç almayı deneyin.
		 System.out.println("\"Olasılıksız\" kitabı ödünç alınıyor:");
		 birinciKutuphane.kitapOduncAl("Olasılıksız");
		 birinciKutuphane.kitapOduncAl("Olasılıksız");
		 ikinciKutuphane.kitapOduncAl("Olasılıksız");
		 System.out.println();
		 // Her kütüphanedeki mevcut kitapların adlarını yazdırın.
		 System.out.println("Birinci kütüphanedeki mevcut kitaplar:");
		 birinciKutuphane.mevcutKitaplariYazdir();
		 System.out.println();
		 System.out.println("İkinci kütüphanedeki mevcut kitaplar:");
		 ikinciKutuphane.mevcutKitaplariYazdir();
		 System.out.println();
		 
		// Birinci kütüphaneye "Olasılıksız" kitabını iade edin.
		 System.out.println("\"Olasılıksız\" kitabı iade ediliyor:");
		 birinciKutuphane.kitapIadeEt("Olasılıksız");
		 System.out.println();
		 // Birinci kütüphanedeki mevcut kitapların adlarını yazdırın.
		 System.out.println("Birinci kütüphanedeki mevcut kitaplar:");
		 birinciKutuphane.mevcutKitaplariYazdir();

	}

}
