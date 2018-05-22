package szpszeri;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Game implements Serializable  {

	private ArrayList<Map> maps = new ArrayList<>();
	
	private Map currentMap=new Map();
		
	//Elinditja a jatekot.
	public void StartGame() {
		//temporary solution, még úgyse kell
		/*while(currentMap.getInGame().size()!=0) {
		currentMap.Running();									
		}*/		
		//EndGame();
	}
	
	//Veget vet a jateknak.
	public void EndGame() {
		for(int i=0;i<currentMap.GetScores().size();i++)
			System.out.println(currentMap.GetScores().get(i));		
	}
	
	
	//A jatek feladasara szolgal.
	public void Concede() {		
		EndGame();		
	}
	
	
	//Kivalaszthatjuk a palyat.
	public Map ChooseMap() {
		for(int i=0;i<maps.size();i++) {
			System.out.println(i+".\t"+maps.get(i).getName());
		}		
		//temporary solution, még úgyse kell
		return maps.get(0);
	}
	
	//"ArrayList maps" lekerdezese.	
	public ArrayList<Map> GetMaps() {
		return maps;
	}
	
	//"ArrayList maps" beallitasa.	
	public void SetMaps(ArrayList<Map> tmp) {
		maps = tmp;
	}
}
