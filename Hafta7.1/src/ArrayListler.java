import java.util.ArrayList;
import java.util.Collections;


public class ArrayListler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//() fonksiyon
		//Genetic type: <String>
		
		int n=5;
		ArrayList<String> listem=new ArrayList<>();
		ArrayList<String> listem2=new ArrayList<String>(5);
		
		ArrayList<Integer> listem3=new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			listem2.add((i+". eleman"));
			//Sona ekleme
			//Liste boyutu onceden verilmis olsa dahi yeni gelecek 			
			//eklemeler icin dinamik olarak yer acar.
		}
		System.out.println(listem2);
		
		listem2.add(2, "deneme");
		System.out.println(listem2);
		//2.indise deger ekleme
		
		listem2.add("deneme");
		//Sona ekleme yapar
		System.out.println(listem2);
		
		System.out.println(listem2.indexOf("deneme"));
		//"deneme" degerinin ilk hangi indiste oldugunu getirir
		System.out.println(listem2.lastIndexOf("deneme"));
		//"deneme" degerinin en son kacinci indiste oldugunu getirir
		
		System.out.println(listem2.contains("deneme2"));
		//Listede aranan elamnin olup olmadigini donderir
		
		if (listem2.contains("deneme")) {
			System.out.println("Liste 'deneme' metnini iceriyor");
		}
		else{
			System.out.println("Listede 'deneme' metni yok");
		}
		
		System.out.println(listem2);
		//Listeyi yazdirir
		
		listem2.remove("deneme");
		//Ýlk "deneme" degerini siler
		System.out.println(listem2);
		
		listem2.remove(5);
		//listeden bir indisle silme yapma
		System.out.println(listem2);
		
		
		for (String deger : listem2) {
			System.out.println(deger);
		}		
		int arraylistBoyutu=listem2.size();
		
		for (int i = 0; i < listem2.size(); i++) {
			System.out.println(listem2.get(i));
			//Belirli bir indisteki degeri getirme
		}
		
		listem2.set(2, "XXXXXXXXXXXXX");
		//2 nolu indisteki degeri XXXXXXXXXX yapar
		
		
		listem2.clear();
		//Listenin tum elemanlarini siler
		listem2.isEmpty();
		//listede deger var mi diye bakar
		
		//Siralamalar
		Collections.sort(listem2);
		//A-->Z
		
		Collections.sort(listem2, Collections.reverseOrder());
		//Z--->A
		
		
		
		
		
		
		
	}

}
