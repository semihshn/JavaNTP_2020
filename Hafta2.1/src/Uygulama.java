import java.util.Scanner;
/**
 * @author ISTE-BM
 * Hiz Uygulamasi
 */
public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		System.out.println("1.aracin hizi:");
		double v1= tara.nextDouble();
		System.out.println("2.aracin hizi:");
		double v2=tara.nextDouble();
		
		System.out.println("t süre giriniz (dk):");
		double t=tara.nextDouble();	
		t/=60;
		
		Hesapla(v1, v2, t);
		
		Uygulama d=new Uygulama();
		d.Hesapla(v1, v2, t);
		System.out.println("Ýki araç arasý mesafe (return):"+ d.Hesapla3(v1, v2, t));
		
		System.out.println("Ýki araç arasý mesafe (return):"+Hesapla2(v1, v2, t));
		
	}
	
	public static void Hesapla(double hiz1, double hiz2, double sure)
	{
		if(hiz1>hiz2)
			System.out.println("Ýki araç arasý mesafe:"+ ((hiz1-hiz2)*sure)+ " km");
		else 
			System.out.println("Ýki araç arasý mesafe:"+ ((hiz2-hiz1)*sure)+ " km");
		
		//Math.abs(hiz1-hiz2)
	}
	
	public static double Hesapla2(double hiz1, double hiz2, double sure){		
		return (Math.abs(hiz1-hiz2)*sure);
	}
	
	public double Hesapla3(double hiz1, double hiz2, double sure){		
		return (Math.abs(hiz1-hiz2)*sure);
	}
	
	
	

}
