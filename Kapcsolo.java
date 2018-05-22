package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Kapcsolo extends Dolgok implements Serializable {

	//Azt a mezot kepviseli, amelyre a lyuk felkerulhet.
	private Mezo lyukable = new Mezo();
	
	//A felrakhato lyuk.	
	private Lyuk segedlyuk = new Lyuk();
	
	//protected boolean open = false;
	private String name="Kapcsolo";
	
	public String getName() {
		return name;
	}

	//Ha dolgozo lep ra, megvizsgalja a valto allasat, es az alapjan alakit rajta.
	@Override
	public void HitByDolgozo(Dolgozo d, Iranyok i) {		
		SwitchD();		
	}
	
	//Ha lada tolodik ra, megvizsgalja a valto allasat, es az alapjan alakit rajta.
	@Override
	public void HitByLada(Lada l, Iranyok i) {		
		SwitchL();		
	}
	
	//Megvizsgalja a mezon levo Dolgokat, es aszerint jar el, hogy tartalmazta-e a lyukat.
	public void SwitchL() {				
		//csak akkor teszünk bele, ha még nem tartalmazza		
		if(!lyukable.GetThings().contains(segedlyuk)) {
			lyukable.Accept(segedlyuk);
		}		
	}
	
	//Megvizsgalja a mezon levo Dolgokat, es aszerint jar el, hogy tartalmazta-e a lyukat.
	public void SwitchD() {	  	
		
	  	//Ha van rajta a bizonyos lyuk, akkor leszedjük rola, mivel Dolgozo lepett a kapcsolora.	  	
	  	if(lyukable.GetThings() != null && lyukable.GetThings().contains(segedlyuk)) {
	  		lyukable.Remove(segedlyuk);
	  	}	  	
	}
	
	//"Mezo lyukable" lekerdezese.	
	public Mezo GetLyukable() {
		return lyukable;
	}
	
	//"Mezo lyukable" beallitasa.	
	public void SetLyukable(Mezo tmp) {
		lyukable = tmp;
	}
	
	//"Lyuk segedlyuk" lekerdezese.
	public Lyuk GetSegedLyuk() {
		return segedlyuk;
	}
	
	//"Lyuk segedlyuk" beallitasa.	
	public void SetSegedLyuk(Lyuk tmp) {
		segedlyuk = tmp;
	}
}