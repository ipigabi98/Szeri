package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Lyuk extends Dolgok implements Serializable {

	protected Map m = new Map();
	
	private String name = "Lyuk";
	
	//Amennyiben dolgozo lep a lyukra, meghivja az annak megolesere szolgalo fuggvenyt.
	@Override
	public void HitByDolgozo(Dolgozo d, Iranyok i) {		
		m.Kill(d);		
	}

	//Amennyiben lada lep a lyukra, meghivja az annak megsemmisiteset eloidezo fuggvenyt.
	@Override
	public void HitByLada(Lada l, Iranyok i) {		
		l.Smashed();		
	}
	
	//"Map m" lekerdezese.	
	public Map GetMap() {
		return m;
	}
			
	//"Map m" beallitasa.			
	public void SetMap(Map tmp) {
		m = tmp;
	}
	
	//Nev lekerdezese.
	public String getName() {
		return name;
	}
}
