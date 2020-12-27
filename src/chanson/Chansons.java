package chanson;
import mains.elementsMusicaux;

public class Chansons implements elementsMusicaux {
	Genre genre;
	String Titre;
	String Artiste;
	String Contenu;
	int Duree;
	int ID;
	public Chansons (Genre genre, String Titre, String Artiste, String Contenu, int Duree, int ID){
	this.genre=genre;
	this.Titre=Titre;
	this.Artiste=Artiste;
	this.Contenu=Contenu;
	this.Duree=Duree;
	this.ID=ID;
}
	@Override
	public String getTitre() {

		return Titre;
	}

	@Override
	public int getDuree() {

		return this.Duree;
	}

	@Override
	public int getID() {

		return this.ID;
	}

	@Override
	public String getContenu() {

		return Contenu;
	}
	public Genre getGenre() {

		return this.genre;
	}
	@Override
	public String getCreateur() {
		// TODO Auto-generated method stub
		return Artiste;
	}
}
