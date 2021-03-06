package tr.edu.medipol.ogrenciler.ahmetarslan.odev2;

public class medipol {
	public static void main(String[] args) {
		int[] ogrenciSinavSonuclari = { 65, 80, 80, 20, 65, 65, 15, 80, 70 };

		// 101 farkli not olabilir
		int[] notlarIstatistik = new int[101];

		for (int i = 0; i < ogrenciSinavSonuclari.length; i++) {
			int notDegeri = ogrenciSinavSonuclari[i];
			// orjinal hatali: notlarIstatistik[notDegeri++];
			// ozkans duzeltme:
			notlarIstatistik[notDegeri]++;
		}

		// Hesaplama sonucunu ekrana bas
		// 0dan 100e tum notlari ekrana bas
		for (int n = 0; n < notlarIstatistik.length; n++) {
			// o notu kac kisinin aldigi bilgisi
			// notlarIstatistik[n] icinde olmali
			int notAlanSayisi = notlarIstatistik[n];
			if (notAlanSayisi > 0) {
				System.out.println(n + " : " + notAlanSayisi);
			}
		}
		// Program ornek ciktisi:
		// 15 : 1
		// 20 : 1
		// 65 : 3
		// 70 : 1
		// 80 : 3
	}
}