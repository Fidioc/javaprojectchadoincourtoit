package Playlist;

import java.util.LinkedList;

import chanson.Chansons;
import livreaudio.livreAudios;

public class Playlist {
	LinkedList<Chansons> Chansonslist = new LinkedList<Chansons>();
	LinkedList<livreAudios> livreAudiolist = new Linkedlist<livreAudios>();
	String Nom;
	int ID;
	public Playlist (String Name, int ID){
}
public String getNom(){
	return Nom;
}
public int getID(){
	return 0;
}
public void addchanson(Chansons cham){
	Chansonslist.add(new Chansons(cham.genre(), cham.getTitre(), cham.getArtiste(), cham.getContenu(), cham.getDuree(), cham.getID()));
}
public void addlivreaudio(livreAudios liau){
	livreAudiolist.add(new livreAudios(liau.getTitre(), liau.getAuteur, liau.getDuree(), liau.getContenu(), liau.getLangue(), liau.getCategories(), liau.getID();
}
}
