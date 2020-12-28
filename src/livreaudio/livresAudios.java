package livreaudio;
import java.util.HashMap;
import java.util.Map;

import Album.Albums;
import mains.elementsMusicaux;

public class livresAudios implements elementsMusicaux {
	String Titre;
	String Auteur;
	Categuories Categories;
	Langue Langues;
	String Contenu;
	int Duree;
	int ID;
	public livresAudios (Categuories cate, Langue langue, String Titre, String Auteur, String Contenu, int Duree, int ID) {
	this.Categories=cate;
	this.Langues=langue;
	this.Titre=Titre;Map<Integer,Albums> album=new HashMap<>();
	this.Auteur=Auteur;
	this.Contenu=Contenu;
	this.Duree=Duree;
	this.ID=ID;
}
public String getTitre(){
	return Titre;
}

public Categuories getCategories(){
        return Categories;
}
public Langue getLangues(){ 
        return Langues;
}
public String getContenu(){
        return Contenu;
}

public int getDuree() {
	// TODO Auto-generated method stub
	return this.Duree;
}
@Override
public int getID() {
	// TODO Auto-generated method stub
	return this.ID;
}
@Override
public String getCreateur() {
	// TODO Auto-generated method stub
	return Auteur;
}



}

