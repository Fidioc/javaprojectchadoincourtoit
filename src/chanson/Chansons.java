package chanson;
import mains.elementsMusicaux;

public class Chansons implements elementsMusicaux {
	String Genre;
	String Titre;
	String Artiste;
	String Contenu;
	int Duree;
	int ID
	public Chansons (String Genre, String Titre, String Artiste, String Contenu, int Duree, int ID){
	this.Genre=Genre;
	this.Titre=Titre;
	this.Artiste=Artiste;
	this.Contenu;
	this.Duree=Duree;
	this.ID=ID;
}
	@Override
	public String getTitre() {
		// TODO Auto-generated method stub
		return Titre;
	}

	@Override
	public String getArtiste() {
		// TODO Auto-generated method stub
		return Artiste;
	}

	@Override
	public int getDuree() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getContenu() {
		// TODO Auto-generated method stub
		return Contenu;
	}
}
