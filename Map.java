package szpszeri;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Map implements Serializable {

	private ArrayList<Mezo> map = new ArrayList<>();
	
	private ArrayList<Mezo> palya = new ArrayList<>();
		
	private String name=new String();
	
	//A pontok szamontartasara szolgalo lista.
	private ArrayList<Dolgozo> scores = new ArrayList<>();
	
	private ArrayList<Dolgozo>	inGame= new ArrayList<>();
	
	private Dolgozo current= null;
	
	//Megoli az epp soron levo dolgozot.
	public void Kill(Dolgozo d) {
		if(inGame.contains(d))
			inGame.remove(d);
		if (current==d) 
			current=null;
		d.Kill();		
	}
	
	//A jatek futasat iranyitja.
	public void Running() {				
		if (current==null && inGame.size()!=0) {		
		if (inGame.size()==1) 
			current=inGame.get(0);
		
		else if(inGame.size()==2) current=inGame.get(1);}				
	}
		
	//Meghivja a pontot ado fuggvenyet az epp soron levo jatekosnak.
	public void AddPoints() {	
		current.PointsGiven();			
	}
	
	//"ArrayList map" lekerdezese.	
	public ArrayList<Mezo> GetMezo() {
		return palya;
	}
	
	//"ArrayList map" beallitasa.	
	public void SetMezo(ArrayList<Mezo> tmp) {
		map = tmp;
	}
	
	//"ArrayList scores" lekerdezese.	
	public ArrayList<Dolgozo> GetScores() {
		return scores;
	}
	
	//"ArrayList scores" beallitasa.	
	public void SetScores(ArrayList<Dolgozo> tmp) {
		scores = tmp;
	} 
	
	public void SetTreeMap(ArrayList<Mezo> sgd) {
		palya = sgd;
	}
	
	//Aktualis Dolgozo lekerdezese.
	public Dolgozo getCurrent() {
		return current;
	}
	
	//A jatekban levo dolgozok listajat visszado fgv.
	public ArrayList<Dolgozo> getInGame(){
		return inGame;
	}
	
	//Nev lekerdezese.
	public String getName() {
		return name;
	}
	
	//Nev beallitasa.
	public void setName(String s) {
		name=s;
	}
	
	public ArrayList<Mezo> GetMapList() {
		return map;
	}
	
	public void SetMapList(ArrayList<Mezo> k) {
		map = k;
	}
}
