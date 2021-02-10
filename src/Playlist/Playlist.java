package Playlist;
import livreaudio.Categuories;

import livreaudio.Langue;
import livreaudio.livresAudios;

import java.io.Serializable;
import java.util.LinkedList;

import chanson.Chansons;
import java.io.Serializable;

public class Playlist implements Serializable{
	LinkedList<Chansons> Chansonslist = new LinkedList<Chansons>();
	LinkedList<livresAudios> livreAudiolist = new LinkedList<livresAudios>();
	String Nom;
	int ID;
	public Playlist (String Name, int ID){
		this.ID = ID;
		this.Nom = Name;
}

public String toString(){
	return "le Nom de la playlist est : "+Nom+" l'identifiant est : "+ ID;
}
public String getNom(){
	return Nom;
}
public int getID(){
	return this.ID;
}
public void addchanson(Chansons cham){
	Chansonslist.add(new Chansons(cham.getGenre(), cham.getTitre(), cham.getCreateur(), cham.getContenu(), cham.getDuree(), cham.getID()));
}
public void addlivreaudio(livresAudios liau){
	livreAudiolist.add(new livresAudios(liau.getCategories(), liau.getLangues(),liau.getTitre(), liau.getCreateur(), liau.getContenu(), liau.getDuree(), liau.getID()));
}
}
