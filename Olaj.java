package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Olaj extends Item implements Serializable {

	private String name="Olaj";
	
	public String getName() {
		return name;
	}
	
	public Olaj() {
		modifier=0.5;
	}
	
	//Az olaj mezejenek modositojanak beallitasa az olaj modositojanak fuggvenyeben.
	@Override
	public void Modify() {
		current.SetMod(modifier);
	}	
}
