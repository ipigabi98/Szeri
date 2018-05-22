package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Dolgok implements Serializable {

	//Dolgok aktualis mezojet szamontarto valtozo.
	
	protected Mezo current;
	
	protected String name = "Dolgok";
	
	//Dolgok sulya.
	
	protected int weight;
		
	//Nem abstract, mert csak a dolgozonak es a ladanak kotelezo megirni.
	
	public void CollideWith(Dolgok d) {	}
		
	public abstract void HitByDolgozo(Dolgozo d, Iranyok i);
		
	public abstract void HitByLada(Lada l, Iranyok i);
		
	//"Mezo current" lekerdezese.
		
	public Mezo GetCurrent() {
		return current;
	}
			
	//"Mezo current" beallitasa.
			
	public void SetCurrent(Mezo tmp) {
		current = tmp;
	}
		
	//"int weight" lekerdezese.
		
	public int GetWeight(){		
		return weight;
	}
		
	//"int weight" beallitasa.
		
	public void SetWeight(int x){
		weight = x;
	}
	
	//Nev lekerdezese.
	
	public String getName() {
		return name;
	}
}
