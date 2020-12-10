package livreaudio;
import mains.elementsMusicaux;

public class livresAudios implements elementsMusicaux {
	String Titre;
	String Auteur;
	String Categories;
	String Langues;
	String Contenu;
	int Duree;
	int ID;
	public livresAudios (String Categories, String Langues, String Titre, String Auteur, String Contenu, int Duree, int ID) {
	this.Categories=Categories;
	this.Langues=Langues;
	this.Titre=Titre;
	this.Auteur=Auteur;
	this.Contenu=Contenu;
	this.Duree=Duree;
	this.ID=ID;
}
public String getTitre(){
	return Titre;
}

public String getAuteur(){
        return Auteur;
}
public String getCategories(){
        return Categories;
}
public String getLangues(){ 
        return Langues;
}
public String getContenu(){
        return Contenu;
}
@Override
public int getDuree() {
	// TODO Auto-generated method stub
	return this.Duree;
}
@Override
public int getID() {
	// TODO Auto-generated method stub
	return this.ID;
}

}

