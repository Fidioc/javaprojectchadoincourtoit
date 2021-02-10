package Album;

import java.io.Serializable;
import java.util.LinkedList;

import chanson.Chansons;

public class Albums implements Serializable{
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
	return "le titre de l'album est "+Titre+" l'artiste est : "+ Artiste+" la durée est : " +Duree+" la date de sorti est : "+ releaseDate+" l'identifiant est : "+ ID;
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
public void affichechansons() {
	for(Chansons el : Albumlist) {
		System.out.println(el);
	}
}
}
