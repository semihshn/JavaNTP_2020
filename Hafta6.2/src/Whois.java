
public enum Whois {
	
	Gokhan("www.gokhanaltan.com"), ISTE("www.iste.edu.tr"), Google("www.google.com");
	
	public String url="";
	//Whois enum string bir parametre alacak
	Whois(String a){	
		this.url=a;
	}
	
	public String urlGoster(){
		return ("URL:"+url);
	}
		

	

	
	
	
}
