package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CelMezo extends Dolgok implements Serializable {

	protected Map m = new Map();
	
	private String name = "CelMezo";
	
	//Amennyiben dolgozo lep ra, nem tortenik semmi.
	
	@Override
	public void HitByDolgozo(Dolgozo d, Iranyok i) {		
	}

	//Amennyiben ladat tolunk ra, pontot kapunk.
	
	@Override
	public void HitByLada(Lada l, Iranyok i) {		
		Score(l);	
	}
	
	//Pontot kapunk es a lada megsemmisitjuk,  helyere falat emelunk.
	
	public void Score(Lada l) {		
		m.AddPoints();
		l.Smashed();
		Akadaly a = new Akadaly();
		current.Accept(a);
		current.Remove(this);		
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
