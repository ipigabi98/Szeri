package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Akadaly extends Dolgok implements Serializable {
	
	private String name="Akadaly";
	
	//Ha az akadalyra dolgozo lepne.
	
	@Override
	public void HitByDolgozo(Dolgozo d, Iranyok i) {		
		d.Refuse();		
	}

	//Ha az akadalyra lada lepne.
	
	@Override
	public void HitByLada(Lada l, Iranyok i) {		
		l.Refuse();		
	}
	
	//Nev lekerdezese.
	
	public String getName() {
		return name;
	}
}
