package szpszeri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("serial")
public class Mezo implements Serializable {

	//A mezon levo Dolgokat tarolja.
	private ArrayList<Dolgok> dolgok=new ArrayList<>();
	
	//Megfelelo iranyokba beallitott mezoket tarolja.
	private HashMap<Iranyok, Mezo> szomszedok = new HashMap<Iranyok, Mezo>();
	
	//A mezo modosito erteke.
	private double mod=1;
	
	private Map mymap;
	
	private Integer x;
	
	private Integer y;
	
	//Dolgok mezore helyezese.
	public void Accept(Dolgok d) {
		dolgok.add(d);
		d.SetCurrent(this);
	}
	
	//Dolgok eltavolitasa a mezorol.
	public void Remove(Dolgok d) {		
		dolgok.remove(d);		
	}
	
	//Szomszedos mezo lekerese.
	public Mezo GetNeighbor(Iranyok i) {		
		return szomszedok.get(i);		
	}
	
	//Szomszedos mezo beallitasa.
	public void SetNeighbor(Iranyok i, Mezo m) {		
		szomszedok.put(i, m);		
	}
	
	//Parameterul kapott Dolog utkoztetese a mezon levo dolgokkal.
	public void GetDolgok(Dolgok d) {		
		for (int i=dolgok.size();i>0;i--) {
			d.CollideWith(dolgok.get(i-1));
		}		
	}
	
	//"ArrayList dolgok" lekerdezese.
	public ArrayList<Dolgok> GetThings() {
		return dolgok;
	}
	
	//"ArrayList dolgok" beallitasa.	
	public void SetThings(ArrayList<Dolgok> seged) {
		dolgok = seged;
	}
	
	//"HashMap szomszedok" lekerdezese.
	public HashMap<Iranyok, Mezo> GetSzomszed() {
		return szomszedok;
	}
	
	//"HashMap szomszedok" beallitasa.
	public void SetSzomszed(HashMap<Iranyok, Mezo> tmp) {
		szomszedok = tmp;
	}
	
	//"int mod" lekerdezese.
	public double GetMod(){
		return mod;
	}
	
	//"int mod" beallitasa.
	public void SetMod(double m){
		mod = m;
	}
	
	//A mezon levo osszes dolognak az egyuttes sulya.
		public int GetOsszSuly() {		
	int cntr = 0;
		for (int i = 0; i < dolgok.size(); i++) {
			cntr += dolgok.get(i).GetWeight();
		}
		return cntr;
	}
	
	//Egy adott iranyban levo osszes doboz sulya (modositasokkal egyutt).
	public double CountWeight(Iranyok i) {
		int tmp = this.GetOsszSuly();
		
		//Ha nincs a kovetkezo mezon semmi, akkor leall a rekurzio.
		if (this.GetNeighbor(i)!=null && this.GetNeighbor(i).GetOsszSuly() == 0) {
			return tmp*mod;
		}
		
		else if(this.GetNeighbor(i)!=null) {
			tmp += this.GetNeighbor(i).CountWeight(i);
			return tmp*mod;
		}		
		
		else return 0;
	}
	
	public String getPosition() {
		String tmp = ("(" + this.GetX().toString() + ", " + this.GetY().toString() + ")");
		return tmp;
	}

	public void setMap(Map mezok) {
		mymap = mezok;
	}
	
	public Integer GetX() {
		return x;
	}
	
	public Integer GetY() {
		return y;
	}
	
	public void SetX(Integer k) {
		x = k;
	}
	
	public void SetY(Integer k) {
		y = k;
	}
	
	public void SetPos(Integer k1, Integer k2) {
		x = k1;
		y = k2;
	}
	
	public Map GetMymap() {
		return mymap;
	}
	
	public void SetMymap(Map k) {
		mymap = k;
	}
}
