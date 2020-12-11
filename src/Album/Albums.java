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
public String getTitre(){
	return Titre;
}
public String getArtiste(){
	return Artiste;
}
public int getDuree(){
	return 0;
}
public int getID(){
	return 0;
}
public int getreleaseDate(){
	return 0;
}
public void addchanson(Chansons cham) {
	Albumlist.add(new Chansons(cham.getgenre(),cham.getTitre(),cham.getArtiste(),cham.getContenu(),cham.getDuree(),cham.getID()));
}
}
