package szpszeri;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Dolgozo extends Dolgok implements Serializable {

	private double strength=14;
	
	private String name = "Dolgozo";
	
	//Az adott jatekos pontjait tarolo valtozo.	
	private int points;
	
	private Iranyok irany = null;
	
	//Valtozo, ami szamon tartja, hogy sikerult-e a mozgatas.
	protected boolean refused = false;
	
	//Valtozo, ami szamon tartja, hogy el-e a dolgozo.
	protected boolean dead = false;
	
	//A megfelelo kommunikalashoz hasznalt valtozok.
	private Map m = new Map();
	private Game g = new Game();
	
	//A dolgozo leteheto Itemjeinek gyujtemenye.
	private ArrayList<Item> items = new ArrayList<>();
	
	//A parameterul kapott Dologhoz hozzauti a dolgozot.
	@Override
	public void CollideWith(Dolgok d) {
		d.HitByDolgozo(this, irany);		
	}

	//A parameterul kapott dolgozot egy megfelelo iranyba uti.
	@Override
	public void HitByDolgozo(Dolgozo d, Iranyok i) {		
		d.Refuse();		
	}

	//A parameterul kapott ladat egy megfelelo iranyba uti.
	@Override
	public void HitByLada(Lada l, Iranyok i) {		
		irany = i;
		Mezo nextMezo = current.GetNeighbor(i);
		int weight=0;
		weight+=nextMezo.CountWeight(i);
		if (weight>strength) refused=true;
		if(refused!=true)
			nextMezo.GetDolgok(this);
		current.Remove(this);
		if(refused) {
			
			//Amennyiben a dolgozot nem lehet a kovetkezo mezore tolni, meghal.
			m.Kill(this);
			return;
		}
		else
			nextMezo.Accept(this);		
	}
	
	
	//A jatekos mozgatja a dolgozot egy iranyba, vagy donthet ugy is, hogy nem mozdul a korben.
	public void Move(Iranyok i) {		
		this.irany = i;
		if(i.getDir()!='x') {
				Mezo nextMezo = current.GetNeighbor(i);
				
				if(nextMezo == null)
					return;
				
				int weight=0;
				weight+=nextMezo.CountWeight(i);
				
				if (weight>strength) 
					refused=true;
				
				if(refused!=true)
					nextMezo.GetDolgok(this);
				
				current.Remove(this);
				
				if(dead) {					
					return;
				}
				
				//Amennyiben a dolgozo nem lephet a kovetkezo mezore, az aktualis mezon marad.
				if(refused) {
					current.Accept(this);
					refused=false;
				}		
				else
					nextMezo.Accept(this);
		}
		else return;
	}
	
	
	//Noveli a dolgozo pontjainak szamat eggyel, ha sikeresen a helyere tolt egy ladat, akkor hivodik meg.
	public void PointsGiven(){		
		points++;				
	}
	
	//Megoli a dolgozot.	
	public void Kill() {
		dead = true;
	}
	
	//A jatekos feladhatja a jatekot, ha ugy erzi, hogy mar nem vezet sehova.
	public void GiveUp(int a) {		
		m.getInGame().remove(a);		
	}
	
	
	//Amennyiben dolgozo lepne dolgozora, ez a fuggveny hivodik meg, ami nem engedi a lepest.
	public void Refuse() {		
		refused = true;				
	}
	
	//Item lerakasa.
	public void PlaceItem(Item it){
		current.Accept(it);
		it.Modify();
	}
	
	//"int points" lekerdezese.	
	public int GetPoints() {
		return points;
	}
	
	//"int points" beallitasa.	
	public void SetPoints(int tmp) {
		points = tmp;
	}
	
	//"Iranyok irany" lekerdezese.	
	public Iranyok GetIrany() {
		return irany;
	}
	
	//"Iranyok irany" beallitasa.	
	public void SetIrany(Iranyok tmp) {
		irany = tmp;
	}
	
	//"Map m" lekerdezese.	
	public Map GetMap() {
		return m;
	}
		
	//"Map m" beallitasa.		
	public void SetMap(Map tmp) {
		m = tmp;
	}
	
	//"Game g" lekerdezese.	
	public Game GetGame() {
		return g;
	}
		
	//"Game g" beallitasa.		
	public void SetGame(Game tmp) {
		g = tmp;
	}
	
	//"ArrayList items" lekerdezese.	
	public ArrayList<Item> GetItems(){
		return items;
	}
	
	//"ArrayList items" beallitasa.
	public void SetItems(ArrayList<Item> tmp){
		items = tmp;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String k) {
		name = k;
	}
}
