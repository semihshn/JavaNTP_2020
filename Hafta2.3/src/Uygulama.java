import java.util.Scanner;


public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		System.out.print("1.kenar:");
		double a= tara.nextDouble();
		System.out.print("2.kenar:");
		double b=tara.nextDouble();		
		System.out.print("aci:");
		double aci=tara.nextDouble();
		
		Uygulama obje=new Uygulama();
		obje.Kosinus(a, b, aci);
		
	}
	public void Kosinus(double a, double b, double aci){
		//Math.cos(Radyan): Derece cinsinden degildir
		double aciRadyan=Math.toRadians(aci);
		double sonuc=Math.pow(a, 2)+ b*b-(2*a*b*Math.cos(aciRadyan));
		System.out.println("3.kenar uzunlugu cos teoremi ile: "+ sonuc);
	}

}

class IsteVize{
	private int a;
	private double b;
	String ad;
	public IsteVize(String ad, double b, int a) {
		this.a=a;
		this.b=b;
		this.ad=ad;		
	}
}
