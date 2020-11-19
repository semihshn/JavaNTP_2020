import java.util.Scanner;
public class Uyglamam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		System.out.print("1.aracin hizi:");
		double v1= tara.nextDouble();
		//System.out.print("1.arac yonu (sag-sol):");
		//String yon1=tara.next();
		System.out.print("2.aracin hizi:");
		double v2=tara.nextDouble();
		//System.out.print("2.arac yonu (sag-sol):");
		//String yon2=tara.next();
		
		System.out.print("t süre giriniz (dk):");
		double t=tara.nextDouble();	
		t/=60;	
		
		System.out.print("Araclarýn surumu (ayni-farkli):");
		String durum=tara.next();
		
		//System.out.println( "Aradaki mesafe : "+ Hesapla(v1, yon1, v2, yon2, t)+" km");
		System.out.println("Aradaki mesafe:"+ Hesapla(v1, v2, t, durum)+ "km");
		
		
	}
	
	
	public static double Hesapla(double v1, String yonu1, double v2, String yonu2, double sure){
		if (yonu1.equals(yonu2)) {
			return ( Math.abs(v1-v2)*sure);
		}
		else{
			return ((v1+v2)*sure);
		}		
	}
	public static double Hesapla(double v1, double v2, double sure, String yon){
		double sonuc;
		if (yon.equals("ayni")) {
			sonuc=( Math.abs(v1-v2)*sure);		
		}
		else if (yon.equals("farkli")) {
			sonuc=((v1+v2)*sure);
		}
		else{
			System.out.println("Hatalý yon girisi");
			sonuc=-1;
		}
		return sonuc;
	}

}
