package Album;


public class Albums {
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
}
