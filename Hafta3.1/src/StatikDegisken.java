
public class StatikDegisken {
	public static int x=0;
	public int y=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatikDegisken sd1=new StatikDegisken();
		StatikDegisken sd2=new StatikDegisken();
		
		x=10;
		sd1.y=55;
		System.out.println(" x deger1:"+x);
		System.out.println("sd1 y degeri:"+sd1.y);
		System.out.println("sd2 y degeri:"+sd2.y);
		System.out.println("sd1 x degeri:"+sd1.x);
		System.out.println("sd2 x degeri:"+sd2.x);
		System.out.println("-------------");
		sd1.x=33;
		System.out.println(" x deger1:"+x);
		System.out.println("sd1 y degeri:"+sd1.y);
		System.out.println("sd2 y degeri:"+sd2.y);
		System.out.println("sd1 x degeri:"+sd1.x);
		System.out.println("sd2 x degeri:"+sd2.x);
		System.out.println("-------------");
		
		StatikDegisken sd3=new StatikDegisken();
		//Yeni bir nesne turetilse de statik degisken ya da fonksiyon 
		//ayni adresi refere eder
		System.out.println("sd3 x degeri:"+sd3.x);
		System.out.println(" x deger1:"+x);
		System.out.println("sd1 x degeri:"+sd1.x);
		System.out.println("sd2 x degeri:"+sd2.x);
		
		StatikFonksiyon nesne1=new StatikFonksiyon();
		StatikFonksiyon nesne2=new StatikFonksiyon();
		nesne1.StatikFonk(55);
		nesne2.StatikOlmayanFonk();
		System.out.println("Nesne 1 ad:"+nesne1.ad);
		System.out.println("Nesne 2 ad:"+nesne2.ad);
		
		
		
		StatikFonksiyon.StatikFonk(5);
		//Statik fonksiyonlar nesne uretmeden kullanilabilir
		System.out.println("Nesne 1 ad:"+nesne1.ad);
		System.out.println("Nesne 2 ad:"+nesne2.ad);
		
	}
}
