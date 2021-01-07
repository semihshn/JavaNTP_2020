
public class YerelSiniflar {
	public String regularIfade="^[0-9]";
	//JDK 8 sonrasi calisitirilabilir.
	
	public static void TelefonDogrula(String tlfno){
		final int numaraUzunluk=10;		
		int numDeger=0;
		
		//Yerel Class Baslangic
		class TelefonNumarasi{
			public String regularIfade="[^0-9]";
			String TemizlenenNumara=null;
			TelefonNumarasi(String tlfno){
				TemizlenenNumara=tlfno.replaceAll(regularIfade, "");
				if (TemizlenenNumara.length()==numaraUzunluk) {
					this.TemizlenenNumara=TemizlenenNumara;
				}
				else{
					this.TemizlenenNumara=null;
				}			
			}
			//Getter Fonksiyonu
			public String getTlfNo(){
				return TemizlenenNumara;
			}
			
			public void numaraGoster(){
				System.out.println("Telefon Numarasi:"+TemizlenenNumara);
			}
			
		}
		//Yerel Class Bitti
		TelefonNumarasi numaram=new TelefonNumarasi(tlfno);
		numaram.numaraGoster();
		
		if (numaram.getTlfNo()==null) {
			System.out.println("Hatalý veya eksik numara girisi yapildi. Lutfen kontrol ederek duzeltiniz");
		}
		else{
			System.out.println("Duzeltilmis Numara:"+numaram.getTlfNo());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(544)-544 54 44
		TelefonDogrula("544544544udu");
		TelefonDogrula("0(544)544 44 44");
		TelefonDogrula("(544)544 44 44");
		TelefonDogrula("544544");
		
	}

}
