package szpszeri;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Lada extends Dolgok implements Serializable {

	//Valtozo, ami szamon tartja, hogy a dobozt meg kell-e semmisiteni.
	protected boolean smashed = false;
	
	//Valtozo, ami szamon tartja, hogy sikerult-e a mozgas.
	protected boolean refused = false;
	
	protected Iranyok irany = null;
		
	private String name = "Lada";
	
	public Lada() {
		this.SetWeight(10);
	}
	public String getName() {
		return name;
	}
	
	//A parameterul kapott Dologhoz hozzauti a ladat.
	@Override
	public void CollideWith(Dolgok d) {		
		d.HitByLada(this, irany);		
	}
	
	//A parameterul kapott dolgozo egy megfelelo irányba loki.
	@Override
	public void HitByDolgozo(Dolgozo d, Iranyok i) {		
		irany = i;
		Mezo nextMezo = current.GetNeighbor(i);
		if(nextMezo == null)
			return;
		nextMezo.GetDolgok(this);
		current.Remove(this);
		if(refused) {
			
			//Amennyiben a mozgas sikertelen a lada marad jelenlegi helyen.
			d.Refuse();
			current.Accept(this);
			refused=false;
		}
		
		//Amennyiben a lada megsemmisul, nem helyezodik fel egyetlen mezore sem.
		else if(smashed)
			return;
		else 
			nextMezo.Accept(this);		
	}
	
	//A paraméterul kapott lada egy megfelelo iranyba loki.
	@Override
	public void HitByLada(Lada l, Iranyok i) {		
		irany = i;
		Mezo nextMezo = current.GetNeighbor(i);
		nextMezo.GetDolgok(this);
		current.Remove(this);
		if(refused) {
			
			//Amennyiben a mozgas sikertelen, a lada marad jelenlegi helyen.
			l.Refuse();
			current.Accept(this);
			refused=false;
			}
		
		//Amennyiben a lada megsemmisül, nem helyezodik fel egyetlen mezore sem.
		if(smashed)
			return;
		
		else 
			nextMezo.Accept(this);	
	}
	
	//A mozgas sikertelensegenek nyilvantartasa.
	public void Refuse() {		
		refused = true;		
	}
	
	//A lada megsemmisulesenek nyilvantartasa.
	public void Smashed() {		
		smashed = true;		
	}
	
	//"Iranyok irany" lekerdezese.	
	public Iranyok GetIrany() {
		return irany;
	}
		
	//"Iranyok irany" beallitasa.	
	public void SetIrany(Iranyok tmp) {
		irany = tmp;
	}
}