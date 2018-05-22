package szpszeri;

import java.io.FileOutputStream;
import java.io.IOException;
 import java.io.ObjectOutputStream;

public class ApplicationMain {

	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		 
		Commands comm = new Commands();
		
		Map terkep = new Map();
		
		Mezo m1 = new Mezo();
		Mezo m2 = new Mezo();
		Mezo m3 = new Mezo();
		Mezo m4 = new Mezo();
		Mezo m5 = new Mezo();
		Mezo m6 = new Mezo();
		Mezo m7 = new Mezo();
		Mezo m8 = new Mezo();
		Mezo m9 = new Mezo();
		Mezo m10 = new Mezo();
		Mezo m11 = new Mezo();
		Mezo m12 = new Mezo();
		Mezo m13 = new Mezo();
		Mezo m14 = new Mezo();
		Mezo m15 = new Mezo();
		Mezo m16 = new Mezo();
		Mezo m17 = new Mezo();
		Mezo m18 = new Mezo();
		Mezo m19 = new Mezo();
		Mezo m20 = new Mezo();
		Mezo m21 = new Mezo();
		Mezo m22 = new Mezo();
		Mezo m23 = new Mezo();
		Mezo m24 = new Mezo();
		Mezo m25 = new Mezo();
		Mezo m26 = new Mezo();
		Mezo m27 = new Mezo();
		Mezo m28 = new Mezo();
		Mezo m29 = new Mezo();
		Mezo m30 = new Mezo();
		Mezo m31 = new Mezo();
		Mezo m32 = new Mezo();
		Mezo m33 = new Mezo();
		Mezo m34 = new Mezo();
		Mezo m35 = new Mezo();
		Mezo m36 = new Mezo();
		Mezo m37 = new Mezo();
		Mezo m38 = new Mezo();
		Mezo m39 = new Mezo();
		Mezo m40 = new Mezo();
		Mezo m41 = new Mezo();
		Mezo m42 = new Mezo();
		
		terkep.GetMezo().add(m1);
		terkep.GetMezo().add(m2);
		terkep.GetMezo().add(m3);
		terkep.GetMezo().add(m4);
		terkep.GetMezo().add(m5);
		terkep.GetMezo().add(m6);
		terkep.GetMezo().add(m7);
		terkep.GetMezo().add(m8);
		terkep.GetMezo().add(m9);
		terkep.GetMezo().add(m10);
		terkep.GetMezo().add(m11);
		terkep.GetMezo().add(m12);
		terkep.GetMezo().add(m13);
		terkep.GetMezo().add(m14);
		terkep.GetMezo().add(m15);
		terkep.GetMezo().add(m16);
		terkep.GetMezo().add(m17);
		terkep.GetMezo().add(m18);
		terkep.GetMezo().add(m19);
		terkep.GetMezo().add(m20);
		terkep.GetMezo().add(m21);
		terkep.GetMezo().add(m22);
		terkep.GetMezo().add(m23);
		terkep.GetMezo().add(m24);
		terkep.GetMezo().add(m25);
		terkep.GetMezo().add(m26);
		terkep.GetMezo().add(m27);
		terkep.GetMezo().add(m28);
		terkep.GetMezo().add(m29);
		terkep.GetMezo().add(m30);
		terkep.GetMezo().add(m31);
		terkep.GetMezo().add(m32);
		terkep.GetMezo().add(m33);
		terkep.GetMezo().add(m34);
		terkep.GetMezo().add(m35);
		terkep.GetMezo().add(m36);
		terkep.GetMezo().add(m37);
		terkep.GetMezo().add(m38);
		terkep.GetMezo().add(m39);
		terkep.GetMezo().add(m40);
		terkep.GetMezo().add(m41);
		terkep.GetMezo().add(m42);
		
		m1.SetPos(0, 0);
		m2.SetPos(0, 1);
		m3.SetPos(0, 2);
		m4.SetPos(0, 3);
		m5.SetPos(0, 4);
		m6.SetPos(0, 5);
		m7.SetPos(0, 6);
		m8.SetPos(1, 0);
		m9.SetPos(1, 1);
		m10.SetPos(1, 2);
		m11.SetPos(1, 3);
		m12.SetPos(1, 4);
		m13.SetPos(1, 5);
		m14.SetPos(1, 6);
		m15.SetPos(2, 0);
		m16.SetPos(2, 1);
		m17.SetPos(2, 2);
		m18.SetPos(2, 3);
		m19.SetPos(2, 4);
		m20.SetPos(2, 5);
		m21.SetPos(2, 6);
		m22.SetPos(3, 0);
		m23.SetPos(3, 1);
		m24.SetPos(3, 2);
		m25.SetPos(3, 3);
		m26.SetPos(3, 4);
		m27.SetPos(3, 5);
		m28.SetPos(3, 6);
		m29.SetPos(4, 0);
		m30.SetPos(4, 1);
		m31.SetPos(4, 2);
		m32.SetPos(4, 3);
		m33.SetPos(4, 4);
		m34.SetPos(4, 5);
		m35.SetPos(4, 6);
		m36.SetPos(5, 0);
		m37.SetPos(5, 1);
		m38.SetPos(5, 2);
		m39.SetPos(5, 3);
		m40.SetPos(5, 4);
		m41.SetPos(5, 5);
		m42.SetPos(5, 6);
		
		Iranyok bal = Iranyok.LEFT;
		Iranyok jobb = Iranyok.RIGHT;
		Iranyok fel = Iranyok.UP;
		Iranyok le = Iranyok.DOWN;
		
		//Sarkok.
		m1.SetNeighbor(Iranyok.RIGHT, m2);
		m1.SetNeighbor(Iranyok.DOWN, m8);
		
		m7.SetNeighbor(bal, m6);
		m7.SetNeighbor(le, m14);
		
		m36.SetNeighbor(fel, m29);
		m36.SetNeighbor(jobb, m37);
		
		m42.SetNeighbor(bal, m41);
		m42.SetNeighbor(fel, m35);		
		
		//Elek.Felso.
		m2.SetNeighbor(Iranyok.LEFT, m1);
		m2.SetNeighbor(Iranyok.DOWN, m9);	
		m2.SetNeighbor(Iranyok.RIGHT, m3);
		
		m3.SetNeighbor(Iranyok.LEFT, m2);
		m3.SetNeighbor(Iranyok.RIGHT, m4);
		m3.SetNeighbor(le, m10);
		
		m4.SetNeighbor(Iranyok.LEFT, m3);
		m4.SetNeighbor(le, m11);
		m4.SetNeighbor(Iranyok.RIGHT, m5);
		
		m5.SetNeighbor(bal, m4);
		m5.SetNeighbor(jobb, m6);
		m5.SetNeighbor(le, m12);
		
		m6.SetNeighbor(bal, m5);
		m6.SetNeighbor(jobb, m7);
		m6.SetNeighbor(le, m13);
		
		//Elek.Bal.
		m8.SetNeighbor(fel, m1);
		m8.SetNeighbor(jobb, m9);
		m8.SetNeighbor(le, m15);
		
		m15.SetNeighbor(fel, m8);
		m15.SetNeighbor(jobb, m16);
		m15.SetNeighbor(le, m22);
		
		m22.SetNeighbor(fel, m15);
		m22.SetNeighbor(jobb, m23);
		m22.SetNeighbor(le, m29);
		
		m29.SetNeighbor(fel, m22);
		m29.SetNeighbor(jobb, m30);
		m29.SetNeighbor(le, m36);
		
		//Elek.Jobb.
		m14.SetNeighbor(fel, m7);
		m14.SetNeighbor(bal, m13);
		m14.SetNeighbor(le, m21);
		
		m21.SetNeighbor(fel, m14);
		m21.SetNeighbor(bal, m20);
		m21.SetNeighbor(le, m28);
		
		m28.SetNeighbor(fel, m21);
		m28.SetNeighbor(bal, m27);
		m28.SetNeighbor(le, m35);
		
		m35.SetNeighbor(fel, m28);
		m35.SetNeighbor(bal, m34);
		m35.SetNeighbor(le, m42);
		
		//Elek.Lenti.
		m37.SetNeighbor(bal, m36);
		m37.SetNeighbor(fel, m30);
		m37.SetNeighbor(jobb, m38);
		
		m38.SetNeighbor(bal, m37);
		m38.SetNeighbor(fel, m31);
		m38.SetNeighbor(jobb, m39);
		
		m39.SetNeighbor(bal, m38);
		m39.SetNeighbor(fel, m32);
		m39.SetNeighbor(jobb, m40);
		
		m40.SetNeighbor(bal, m39);
		m40.SetNeighbor(fel, m33);
		m40.SetNeighbor(jobb, m41);
		
		m41.SetNeighbor(bal, m40);
		m41.SetNeighbor(fel, m34);
		m41.SetNeighbor(jobb, m42);
		
		//Belsoresz.Masodiksor.
		m9.SetNeighbor(bal, m8);
		m9.SetNeighbor(fel, m2);
		m9.SetNeighbor(jobb, m10);
		m9.SetNeighbor(le, m16);
		
		m10.SetNeighbor(bal, m9);
		m10.SetNeighbor(fel, m3);
		m10.SetNeighbor(jobb, m11);
		m10.SetNeighbor(le, m17);
		
		m11.SetNeighbor(bal, m10);
		m11.SetNeighbor(fel, m4);
		m11.SetNeighbor(jobb, m12);
		m11.SetNeighbor(le, m18);
		
		m12.SetNeighbor(bal, m11);
		m12.SetNeighbor(fel, m5);
		m12.SetNeighbor(jobb, m13);
		m12.SetNeighbor(le, m19);
		
		m13.SetNeighbor(bal, m12);
		m13.SetNeighbor(fel, m6);
		m13.SetNeighbor(jobb, m14);
		m13.SetNeighbor(le, m20);
		
		//Belsoresz.Harmadiksor.
		m16.SetNeighbor(bal, m15);
		m16.SetNeighbor(fel, m9);
		m16.SetNeighbor(jobb, m17);
		m16.SetNeighbor(le, m23);
		
		m17.SetNeighbor(bal, m16);
		m17.SetNeighbor(fel, m10);
		m17.SetNeighbor(jobb, m18);
		m17.SetNeighbor(le, m24);
		
		m18.SetNeighbor(bal, m17);
		m18.SetNeighbor(fel, m11);
		m18.SetNeighbor(jobb, m19);
		m18.SetNeighbor(le, m25);
		
		m19.SetNeighbor(bal, m18);
		m19.SetNeighbor(fel, m12);
		m19.SetNeighbor(jobb, m20);
		m19.SetNeighbor(le, m26);
		
		m20.SetNeighbor(bal, m19);
		m20.SetNeighbor(fel, m13);
		m20.SetNeighbor(jobb, m21);
		m20.SetNeighbor(le, m27);
		
		//Belso.Negyediksor.
		m23.SetNeighbor(bal, m22);
		m23.SetNeighbor(fel, m16);
		m23.SetNeighbor(jobb, m24);
		m23.SetNeighbor(le, m30);
		
		m24.SetNeighbor(bal, m23);
		m24.SetNeighbor(fel, m17);
		m24.SetNeighbor(jobb, m25);
		m24.SetNeighbor(le, m31);
		
		m25.SetNeighbor(bal, m24);
		m25.SetNeighbor(fel, m18);
		m25.SetNeighbor(jobb, m26);
		m25.SetNeighbor(le, m32);
		
		m26.SetNeighbor(bal, m25);
		m26.SetNeighbor(fel, m19);
		m26.SetNeighbor(jobb, m27);
		m26.SetNeighbor(le, m33);
		
		m27.SetNeighbor(bal, m26);
		m27.SetNeighbor(fel, m20);
		m27.SetNeighbor(jobb, m28);
		m27.SetNeighbor(le, m34);
		
		//Belsoresz.Otodiksor.
		m30.SetNeighbor(bal, m29);
		m30.SetNeighbor(fel, m23);
		m30.SetNeighbor(jobb, m31);
		m30.SetNeighbor(le, m37);
		
		m31.SetNeighbor(bal, m30);
		m31.SetNeighbor(fel, m24);
		m31.SetNeighbor(jobb, m32);
		m31.SetNeighbor(le, m38);
		
		m32.SetNeighbor(bal, m31);
		m32.SetNeighbor(fel, m25);
		m32.SetNeighbor(jobb, m33);
		m32.SetNeighbor(le, m39);
		
		m33.SetNeighbor(bal, m32);
		m33.SetNeighbor(fel, m26);
		m33.SetNeighbor(jobb, m34);
		m33.SetNeighbor(le, m40);
		
		m34.SetNeighbor(bal, m33);
		m34.SetNeighbor(fel, m27);
		m34.SetNeighbor(jobb, m35);
		m34.SetNeighbor(le, m41);					
		
		Dolgozo d1 = new Dolgozo();
		
		Lada l1 = new Lada();
		Lada l2 = new Lada();
		
		Olaj o1 = new Olaj();
		
		Mez mez = new Mez();
		
		m18.Accept(d1);		
		m25.Accept(o1);
		m25.Accept(l1);
		m17.Accept(mez);
		m17.Accept(l2);
		
		terkep.getInGame().add(d1);
		
		FileOutputStream fos = new FileOutputStream("Test5.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(terkep);
		System.out.println("Kiiras megtortent.");	
		
		/*FileInputStream fis = new FileInputStream("sgd.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Map tmp1 = (Map) ois.readObject();*/
		
		Map tmp1 = comm.Betoltes("Test5.txt");
		
		comm.loadMap(tmp1);				
		comm.listMez();
		comm.listLada();
		comm.listDolgozo();
		comm.moveDolgozo("a");		
		comm.listLada();	
		comm.listMez();
		comm.listDolgozo();
	}
}
