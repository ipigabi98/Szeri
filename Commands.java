package szpszeri;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Commands {

	private Map cmap = new Map();
		
	public void loadMap(Map map) {
		cmap = map;
	}
		
	public Map Betoltes(String s) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(s);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Map tmp1 = (Map) ois.readObject();
		ois.close();
		return tmp1;
	}
	
	//listazo fuggvenyek a kulonbozo dolgokhoz
	public String listAkadaly() {
		return listAny("Akadaly");
	}
			
	public String listDolgozo() {
		return listAny("Dolgozo");
	}
		
	public String listKapcsolo() {
		return listAny("Kapcsolo");		
	}
				
	public String listLada() {
		return listAny("Lada");
	}
				
	public String listLyuk() {
		return listAny("Lyuk");		
	}
				
	public String listMez() {
		return listAny("Mez");
	}
						
	public String listOlaj() {
		return listAny("Olaj");
	}
	
	//dolgozo mozgatasa az adott iranyba
	public void moveDolgozo(String s) {
		cmap.Running();
		Iranyok i=Iranyok.NOTHING;
		if(s=="w")	i=Iranyok.UP;
		if(s=="s") i=Iranyok.DOWN;
		if(s=="a") i=Iranyok.LEFT;
		if(s=="d") i=Iranyok.RIGHT;
		if(cmap.getCurrent()!=null)
			cmap.getCurrent().Move(i);
	}
	
	//mez lehelyezese
	public void placeMez() {
		cmap.Running();
		cmap.getCurrent().PlaceItem(cmap.getCurrent().GetItems().get(1));
	}
	
	//olaj lehelyezese
	public void placeOlaj() {
		cmap.Running();
		cmap.getCurrent().PlaceItem(cmap.getCurrent().GetItems().get(0));
	}
	
	public String ListCelmezo() {
		return listAny("CelMezo");
	}
	
	public void EndGame() {
		System.exit(0);
	}
	
	public void GiveUp(int sz) {
		
		cmap.getInGame().remove(0);			
	}
	
	public String listAny(String s) {
		int db=1;
		String stemp="";
		ArrayList<Mezo> tmpmap = cmap.GetMezo();
		
		for(int k = 0; k < tmpmap.size(); k++){
			
			Mezo temp = tmpmap.get(k);
			
			ArrayList<Dolgok> things = temp.GetThings();
			
			if(things != null) {
				
				for (int j = 0; j < things.size(); j++) {
					
					//if(things.get(j).getName() != null)
					if(things.get(j).getName().equals(s)) {
						stemp+=(db+" "+temp.getPosition()+"\n");
						db++;
					}
				}
			}
		}
		
		if (stemp!="") System.out.print(stemp);
		return stemp;
	}
}
