package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Mez extends Item implements Serializable {

	private String name="Mez";
	
	//Nev lekerdezese.
	public String getName() {
		return name;
	}
	
	//Modosito ertek beallitasa.
	public Mez() {
		modifier=2;
	}
	
	//A mez mezejenek modositojanak beallitasa a mez modositojanak fuggvenyeben.
	@Override
	public void Modify() {
		current.SetMod(modifier);
	}	
}
