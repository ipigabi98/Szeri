package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Item extends Dolgok implements Serializable {

	//Az Item modosito erteke.
	protected double modifier;
		
	//A modosito metodus.
	public abstract void Modify();
		
	public void HitByDolgozo(Dolgozo d, Iranyok i) { }
		
	public void HitByLada(Lada l, Iranyok i) { }
		
	//"int modifier" lekerdezese.	
	public double GetModifier(){
		return modifier;
	}
		
	//"int modifier" beallitasa.
	public void SetModifier(int m){
		modifier = m;
	}
}
