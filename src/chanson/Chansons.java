package chanson;
import mains.elementsMusicaux;

public class Chansons implements elementsMusicaux {
	String Genre;
	String Titre;
	String Artiste;
	String Contenu;
	int Duree;
	int ID;
	public Chansons (String Genre, String Titre, String Artiste, String Contenu, int Duree, int ID){
	this.Genre=Genre;
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

	public String getArtiste() {

		return Artiste;
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
}
