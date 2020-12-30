package Album;

import java.util.LinkedList;

import chanson.Chansons;

public class Albums {
	LinkedList<Chansons> Albumlist = new LinkedList<Chansons>();
	String Titre;
	String Artiste;
	int Duree;
	int releaseDate;
	int ID;
	public Albums (String Titre, String Artiste, int Duree, int releaseDate, int ID){
	this.Titre=Titre;
	this.Artiste=Artiste;
	this.Duree=Duree;
	this.releaseDate=releaseDate;
	this.ID=ID;
}
public String toString(){
	return Titre, Artiste, Duree, releaseDate, ID;
}
public String getTitre(){
	return Titre;
}
public String getArtiste(){
	return Artiste;
}
public int getDuree(){
	return this.Duree;
}
public int getID(){
	return this.ID;
}
public int getreleaseDate(){
	return this.releaseDate;
}
public void addchanson(Chansons cham) {
	Albumlist.add(new Chansons(cham.getGenre(),cham.getTitre(),cham.getCreateur(),cham.getContenu(),cham.getDuree(),cham.getID()));
}
public void addchansonexist(Chansons cham) {
	Albumlist.add(cham);
}
}
