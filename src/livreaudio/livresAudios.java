package livreaudio;
import mains.elementsMusicaux;

public class livresAudios implements elementsMusicaux {
	String Titre;
	String Artiste;
	String Categories;
	String Langues;
	String Contenu;
	int Duree;
	int ID;
	public livresAudios (String Categories, String Langues, String Titre, String Artiste, String Contenu, int Duree, int ID) {
	this.Categories=Categories;
	this.Langues=Langues;
	this.Titre=Titre;
	this.Artiste=Artiste;
	this.Contenu=Contenu;
	this.Duree=Duree;
	this.ID=ID;
}
public String getTitre(){
	return Titre;
}
public String getArtiste(){ 
        return Artiste;
}
public String getCategories(){ 
        return Categories;
}
public String getLangues(){ 
        return Langues;
}
public String getContenu(){
        return Titre;
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

}

