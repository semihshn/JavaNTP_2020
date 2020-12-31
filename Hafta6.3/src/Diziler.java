import java.lang.reflect.Array;
import java.util.Arrays;


public class Diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi1=new int[10];
		int[] dizi2={11, 1453, 1071, 2020};
		int[] dizi3;
		
		dizi3=new int[5];
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println("dizinin " + (i)+". indisi: "+dizi2[i]);
		}
		int elemansayisi=dizi2.length;
		
		//foreach
		for (int eleman : dizi2) {
			System.out.println(eleman);
		}
		
		System.out.println(Arrays.binarySearch(dizi2, 1453));
		//1071 için deneyin
		
		//Arrays.sort(dizi2);
		//Diiyi sýralar
		
		//Arrays.sort(dizi2, 2,5);
		//Belirli bolgedeki siralama
		
		Arrays.fill(dizi3, 2,4,100);
		//Bir dizinin belirli araligina deger atamak icin kullanilir
		//dizi3 un'den baslayip ve 4. indise kadar 100 atandi
		for (int eleman : dizi3) {
			System.out.println(eleman);
		}		
		
		Arrays.equals(dizi2, dizi3);
		//2 dizinin birbirine esit olup olmadigina bakar
		
		int[][] dizi4=new int[5][5];
		//Matris
		int[][][] dizi5=new int[4][4][4];
		//Tensor
		
		dizi4[2][3]=45;
		//dizi4 un 2.satir 3.sutununa 45 degeri atar.
		int[][] dizi6={{2,6}, {15,36}, {44,34}};
		int[][][] dizi7={{{2,6}, {15,36}, {44,34}} };
		
		
		
	}

}
